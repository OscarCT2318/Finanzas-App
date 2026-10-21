package com.example.finanzasapp.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalanceWallet
import androidx.compose.material.icons.filled.BarChart
import androidx.compose.material.icons.filled.Category
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination

@Composable
fun BottomNavBar(navController: NavController, currentRoute: String?) {
    val items = listOf(
        Triple(Screen.Home, "Home", Icons.Filled.Home),
        Triple(Screen.Statistics, "Estadísticas", Icons.Filled.BarChart),
        Triple(Screen.Categories, "Categorías", Icons.Filled.Category),
        Triple(Screen.Budgets, "Presupuestos", Icons.Filled.AccountBalanceWallet)
    )

    NavigationBar {
        items.forEach { (screen, label, icon) ->
            NavigationBarItem(
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = { Icon(imageVector = icon, contentDescription = null) },
                label = { Text(label) }
            )
        }
    }
}
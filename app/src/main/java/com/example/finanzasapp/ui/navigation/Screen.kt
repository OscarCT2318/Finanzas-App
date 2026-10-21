package com.example.finanzasapp.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object AddExpense : Screen("add_expense")
    object EditExpense : Screen("edit_expense/{expenseId}")
    object Statistics : Screen("statistics")
    object Categories : Screen("categories")
    object Budgets : Screen("budgets")
}
package com.example.finanzasapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.activity.compose.setContent
import com.example.finanzasapp.ui.navigation.MainScreen
import com.example.finanzasapp.ui.theme.FinanzasTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinanzasTheme {
                MainScreen()
            }
        }
    }
}
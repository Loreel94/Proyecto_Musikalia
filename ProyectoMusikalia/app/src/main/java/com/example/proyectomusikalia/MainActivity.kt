package com.example.proyectomusikalia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.proyectomusikalia.screens.Cancion
import com.example.proyectomusikalia.screens.MusikaliaApp
import com.example.proyectomusikalia.ui.MusikaliaViewModel
import com.example.proyectomusikalia.ui.theme.ProyectoMusikaliaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val viewModel = viewModel<MusikaliaViewModel>()
            ProyectoMusikaliaTheme {
                NavHost(navController = navController, startDestination = "Pantalla Principal" ) {
                    composable("Pantalla Principal") {
                      MusikaliaApp(navController, viewModel)
                    }
                    composable("Pantalla Cancion") {
                        Cancion(navController, viewModel)
                    }
                }
            }
        }
    }
}


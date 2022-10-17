package com.example.recipe_app_android.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recipe_app_android.presentation.recipe_list.RecipeListScreen
import com.example.recipe_app_android.presentation.ui.theme.RecipeappandroidTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeappandroidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.RecipeListScreen.route
                    ) {
                        composable(
                            route = Screen.RecipeListScreen.route
                        ) {
                            RecipeListScreen(navController)
                        }
                        /*composable(
                            route = Screen.RecipeDetailScreen.route + "/{recipeId}"
                        ) {
                            RecipeDetailScreen()
                        }*/
                    }
                }
            }
        }
    }
}


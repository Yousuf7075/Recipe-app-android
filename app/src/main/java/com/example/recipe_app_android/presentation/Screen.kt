package com.example.recipe_app_android.presentation

sealed class Screen(val route: String) {
    object RecipeListScreen: Screen("recipe_list_screen")
    object RecipeDetailScreen: Screen("recipe_detail_screen")
}

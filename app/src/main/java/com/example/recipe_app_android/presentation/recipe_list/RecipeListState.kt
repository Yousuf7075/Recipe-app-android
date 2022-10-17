package com.example.recipe_app_android.presentation.recipe_list

import com.example.recipe_app_android.domain.models.Recipe

data class RecipeListState(
    val isLoading: Boolean = false,
    val recipes: List<Recipe> = emptyList(),
    val error: String = ""
)
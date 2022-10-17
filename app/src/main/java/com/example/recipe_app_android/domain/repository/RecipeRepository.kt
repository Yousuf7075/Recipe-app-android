package com.example.recipe_app_android.domain.repository

import com.example.recipe_app_android.data.remote.dto.RecipeDto

interface RecipeRepository {
    suspend fun getRecipes(): RecipeDto
}
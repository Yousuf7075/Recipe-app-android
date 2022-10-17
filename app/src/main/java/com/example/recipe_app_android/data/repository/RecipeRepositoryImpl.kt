package com.example.recipe_app_android.data.repository

import com.example.recipe_app_android.data.remote.RecipeApi
import com.example.recipe_app_android.data.remote.dto.RecipeDto
import com.example.recipe_app_android.domain.repository.RecipeRepository
import javax.inject.Inject

class RecipeRepositoryImpl @Inject constructor(private val api: RecipeApi) : RecipeRepository {
    override suspend fun getRecipes(): RecipeDto {
        return api.getRecipes()
    }
}
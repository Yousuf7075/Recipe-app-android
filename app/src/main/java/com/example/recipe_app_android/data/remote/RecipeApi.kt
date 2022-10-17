package com.example.recipe_app_android.data.remote

import com.example.recipe_app_android.common.Constants
import com.example.recipe_app_android.data.remote.dto.RecipeDto
import retrofit2.http.GET

interface RecipeApi {

    @GET("/recipes/complexSearch?apiKey=${Constants.API_KEY}")
    suspend fun getRecipes(): RecipeDto
}
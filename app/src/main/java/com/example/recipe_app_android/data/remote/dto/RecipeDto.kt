package com.example.recipe_app_android.data.remote.dto


import com.example.recipe_app_android.domain.models.Recipe
import com.google.gson.annotations.SerializedName

data class RecipeDto(
    @SerializedName("number")
    val number: Int,
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("results")
    val results: List<Result>,
    @SerializedName("totalResults")
    val totalResults: Int
)


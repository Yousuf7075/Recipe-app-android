package com.example.recipe_app_android.data.remote.dto


import com.example.recipe_app_android.domain.models.Recipe
import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("imageType")
    val imageType: String,
    @SerializedName("title")
    val title: String
)

fun Result.toRecipe(): Recipe {
    return Recipe(id = id, image = image, title = title)
}
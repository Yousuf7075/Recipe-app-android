package com.example.recipe_app_android.domain.user_case.get_recipes

import com.example.recipe_app_android.common.Resource
import com.example.recipe_app_android.data.remote.dto.toRecipe
import com.example.recipe_app_android.domain.models.Recipe
import com.example.recipe_app_android.domain.repository.RecipeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetRecipesUseCase @Inject constructor(private val repository: RecipeRepository) {
    operator fun invoke(): Flow<Resource<List<Recipe>>> = flow {
        try {
            emit(Resource.Loading<List<Recipe>>())
            val recipes = repository.getRecipes().results.map { it.toRecipe() }
            emit(Resource.Success<List<Recipe>>(recipes))
        } catch (e: HttpException) {
            emit(Resource.Error<List<Recipe>>(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error<List<Recipe>>("Couldn't reach server. Check your internet connection."))
        }
    }

}
package com.example.project_kozlova.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.project_kozlova.data.Recipes
import androidx.lifecycle.viewModelScope
import com.example.project_kozlova.ui.theme.RetrofitClient
import kotlinx.coroutines.launch

class RecipesViewModel: ViewModel(){
    fun addRecipes (recipe: Recipes) {
        viewModelScope.launch {
            try {
                val newRecipe = RetrofitClient.recipesService.addRecipe(recipe)
                Log.d(
                    "RecipesViewModel",
                    "id:${newRecipe.id}\n " +
                            " ${newRecipe.name}\n" +
                            "ingridients: ${newRecipe.ingredients}\n" +
                            "cookTime: ${newRecipe.cookTimeMinutes}\n" +
                            "difficulty:${newRecipe.difficulty}"
                )
            } catch (ex: Exception) {
                Log.d("RecipesViewModel", "${ex.message}")
            }
        }
    }
}



package com.example.project_kozlova

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_kozlova.data.Ingredients
import com.example.project_kozlova.data.Recipes
import com.example.project_kozlova.viewModel.ProductsViewModel
import com.example.project_kozlova.viewModel.RecipesViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            val productsViewModel: ProductsViewModel = viewModel()
//            productsViewModel.fetchProduct()
            val recipesViewModel: RecipesViewModel=viewModel()
            val newRecipe= Recipes(
                name = "Куриное филе в сливочно-чесночном соусе",
                ingredients = Ingredients(listOf("Куриное филе","сливки","чеснок",
                    "сливочное масло","растительное масло","твердый сыр",
                    "соль","черный перец","итальянские травы")),
                cookTimeMinutes = 25,
                difficulty = "Easy"
            )
            recipesViewModel.addRecipes(newRecipe)
        }
    }
}


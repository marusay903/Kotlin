package com.example.project_kozlova

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.project_kozlova.data.Recipe
import com.example.project_kozlova.viewModel.RecipesViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            val productsViewModel: ProductsViewModel = viewModel()
//            productsViewModel.fetchProduct()
            val recipesViewModel: RecipesViewModel=viewModel()
            val newRecipe= Recipe(
                name = "Куриное филе в сливочно-чесночном соусе",
                ingredients = listOf("Куриное филе","сливки","чеснок",
                    "сливочное масло","растительное масло","твердый сыр",
                    "соль","черный перец","итальянские травы"),
                cookTimeMinutes = 25,
                difficulty = "Easy"
            )
            recipesViewModel.addRecipes(newRecipe)
        }
    }
}


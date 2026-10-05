package com.example.project_kozlova.ui.theme.service

import com.example.project_kozlova.data.Recipe
import retrofit2.http.Body
import retrofit2.http.POST

interface RecipesService {
    @POST("recipes/add")
    suspend fun addRecipe (@Body recipe:Recipe): Recipe
}
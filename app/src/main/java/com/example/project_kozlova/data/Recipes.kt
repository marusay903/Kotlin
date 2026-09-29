package com.example.project_kozlova.data

data class Recipes(
    val id:Int?=null,
    val name: String,
    val ingredients: Ingredients,
    val cookTimeMinutes: Int,
    val difficulty: String
)

package com.example.project_kozlova.ui.theme

import com.example.project_kozlova.ui.theme.service.ProductService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitClient {
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val productService: ProductService=retrofit.create(ProductService::class.java)
}
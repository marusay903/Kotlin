package com.example.project_kozlova.ui.theme

import com.example.project_kozlova.ui.theme.service.ProductService
import com.example.project_kozlova.ui.theme.service.RecipesService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.net.InetSocketAddress
import java.net.Proxy


object RetrofitClient {
    private val loggingInterceptor= HttpLoggingInterceptor().apply {
        level= HttpLoggingInterceptor.Level.BODY
    }
    val proxy= Proxy(Proxy.Type.HTTP, InetSocketAddress("10.207.106.59", 3128))

    val okHttpClient= OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .proxy(proxy)
        .build()
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val productService: ProductService=retrofit.create(ProductService::class.java)
    val recipesService: RecipesService=retrofit.create(RecipesService::class.java)
}
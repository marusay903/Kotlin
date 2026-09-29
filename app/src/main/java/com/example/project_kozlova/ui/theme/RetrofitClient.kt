package com.example.project_kozlova.ui.theme

import com.example.project_kozlova.ui.theme.service.ProductService
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import java.net.InetSocketAddress
import java.net.Proxy


object RetrofitClient {
    val proxy= Proxy(Proxy.Type.HTTP, InetSocketAddress("10.207.106.59", 3128))

    val okHttpClient= OkHttpClient.Builder()
        .proxy(proxy)
        .build()
    val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val productService: ProductService=retrofit.create(ProductService::class.java)
}
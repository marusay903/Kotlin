package com.example.project_kozlova.ui.theme.service

import com.example.project_kozlova.data.ProductResponce
import retrofit2.http.GET

interface ProductService {
    @GET ("products")
    suspend fun getProduct(): ProductResponce
}
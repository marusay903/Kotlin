package com.example.project_kozlova.ui.theme.service

import com.example.project_kozlova.data.TodoResponce
import com.example.project_kozlova.ui.theme.RetrofitClient
import retrofit2.http.GET
import retrofit2.http.Header

interface TodoService {
    @GET("todos/records")
    suspend fun getTodos(@Header("Authorization")token: String): TodoResponce
}
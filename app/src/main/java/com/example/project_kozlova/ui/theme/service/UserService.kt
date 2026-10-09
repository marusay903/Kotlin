package com.example.project_kozlova.ui.theme.service

import com.example.project_kozlova.data.User
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface UserService {
    @GET("users/{id}")
    suspend fun getUserById(@Path("id") userId: Int):User
    @PUT("users/{id}")
    suspend fun updateUser(@Path("id")userId:Int,@Body user: User): User
}
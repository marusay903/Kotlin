package com.example.project_kozlova.ui.theme.service

import com.example.project_kozlova.data.User
import retrofit2.http.Body
import retrofit2.http.PUT
import retrofit2.http.Path

interface UserService {
    @PUT("users/{id}")
    suspend fun updateUser(@Path("id")userId:Int,@Body user: User): User
}
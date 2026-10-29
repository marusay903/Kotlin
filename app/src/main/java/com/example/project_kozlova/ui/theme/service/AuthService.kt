package com.example.project_kozlova.ui.theme.service

import com.example.project_kozlova.data.AuthRequest
import okhttp3.Request
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthService {
    @POST("api/collections/users/auth-with-password")
    suspend fun authWidthPassword(@Body authRequest: AuthRequest): AuthRequest
}
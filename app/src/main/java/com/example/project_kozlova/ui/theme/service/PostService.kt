package com.example.project_kozlova.ui.theme.service

import com.example.project_kozlova.data.Post
import retrofit2.http.DELETE
import retrofit2.http.Path

interface PostService {
    @DELETE("posts/{id}")
    suspend fun deletePost(@Path("id") postid: Int): Post
}
package com.example.project_kozlova.data

data class Post(
    val id: Int?=null,
    val title: String,
    val body: List <String>?=null,
    val tags: List <String>?=null,
    val reactions: Reactions?=null,
    val views: Int?=null,
    val userId: Int
)

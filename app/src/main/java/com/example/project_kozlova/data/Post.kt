package com.example.project_kozlova.data

import android.R

data class Post(
    val id: Int?=null,
    val title: String,
    val body: String,
    val tags: List <String>?=null,
    val reactions: Reactions?=null,
    val views: Int?=null,
    val userId: Int,
    //val deleted:
)

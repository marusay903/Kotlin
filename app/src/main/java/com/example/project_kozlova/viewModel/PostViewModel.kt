package com.example.project_kozlova.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project_kozlova.ui.theme.RetrofitClient
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {
    fun deletePost(postId: Int){
        viewModelScope.launch {
            val deletePost= RetrofitClient.postService.deletePost(postId)
            try {
                Log.d(
                    "PostViewModel",
                    "id: ${deletePost.id}"+
                      "\ntitle: ${deletePost.title}"+
                     "\nbody: ${deletePost.body}"+
                            "\ntags: ${deletePost.tags}"+
                            "\nreactions: ${deletePost.reactions}"+
                            "\nviews: ${deletePost.views}"+
                            "\nuserId: ${deletePost.userId}"+
                            "\ndeleted:${deletePost.deleted}"
                )

            }
            catch (ex: Exception) {
                Log.d("PostViewModel","${ex.message}",

                )
            }
        }
    }
}

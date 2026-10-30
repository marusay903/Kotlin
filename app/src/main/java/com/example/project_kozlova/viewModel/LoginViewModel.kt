package com.example.project_kozlova.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project_kozlova.data.AuthRequest
import com.example.project_kozlova.data.AuthResponce
import com.example.project_kozlova.ui.theme.RetrofitClient
import kotlinx.coroutines.launch

class LoginViewModel : ViewModel(){
    fun login(authRequest: AuthRequest)
    {
        viewModelScope.launch {
             try {
                val authResponce= RetrofitClient.authService.authWidthPassword(authRequest)
              authResponce.token.let { token->
                  val todoResponce= RetrofitClient.todoService.getTodos(token = "$token")

                  todoResponce.items?.forEach { item->
                      Log.d("LoginViewModel",
                          "id: ${item.id}"+
                          "\ntodo: ${item.todo}"+
                          "\ncompleted: ${item.completed}"+
                          "\ncreated: ${item.created}"+
                          "\nupdated: ${item.updated}"
                      )
                  }
              }
             }
             catch (ex: Exception) {
                 Log.d("LoginViewModel","${ex.message}")
             }
        }
    }
}
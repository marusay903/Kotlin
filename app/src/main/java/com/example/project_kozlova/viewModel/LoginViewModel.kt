package com.example.project_kozlova.viewModel

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
           // try {
            //    val authResponce= RetrofitClient.authService.authWidthPassword(authRequest)
              //  authResponce
           // }
            //catch ()
        }
    }
}
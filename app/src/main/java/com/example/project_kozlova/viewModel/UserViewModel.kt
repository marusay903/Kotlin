package com.example.project_kozlova.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project_kozlova.data.Recipe
import com.example.project_kozlova.ui.theme.RetrofitClient
import kotlinx.coroutines.launch

class UserViewModel: ViewModel(){
    fun updateUser (id: Int) {
        viewModelScope.launch {
            try {
              //  val user = RetrofitClient.userService.updateUser(userId= id)
             //   Log.d(
                   // "UserViewModel",
                   // "id:${user.id}\n " +
                  //          " ${user.name}\n" +
                           // "ingridients: ${user.ingredients}\n" +
                           // "cookTime: ${user.cookTimeMinutes}\n" +
                           // "difficulty:${user.difficulty}"
               // )
            } catch (ex: Exception) {
                Log.d("UserViewModel", "${ex.message}")
            }
        }
    }
}

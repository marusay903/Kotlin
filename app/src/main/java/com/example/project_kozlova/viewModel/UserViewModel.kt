package com.example.project_kozlova.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project_kozlova.data.Recipe
import com.example.project_kozlova.data.User
import com.example.project_kozlova.ui.theme.RetrofitClient
import kotlinx.coroutines.launch

class UserViewModel: ViewModel(){
    fun updateUser (id: Int) {
        viewModelScope.launch {
            try {
             val currentUser = RetrofitClient.userService.getUserById(id)
                Log.d(
                    "UserViewModel",
                   "id:${currentUser.id}\n " +
                         "lastName: ${currentUser.lastName}\n" +
                          "firstName: ${currentUser.firstName}\n" +
                           "age:${currentUser.age}\n"+
                           "hair: ${currentUser.hair}"
                )
                val newUser = currentUser.copy(
                    lastName = "Воронова",
                    firstName = "Ирина",
                    age = 29,
                    hair = currentUser.hair.copy(color = "темный", type = "кудрявые")

                )
                val updateUser= RetrofitClient.userService.updateUser(userId = id, user = newUser)
            } catch (ex: Exception) {
                Log.d("UserViewModel", "${ex.message}")
            }
        }
    }
}

package com.example.project_kozlova.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.project_kozlova.ui.theme.RetrofitClient
import kotlinx.coroutines.launch

class ProductsViewModel: ViewModel() {
    fun fetchProduct (){
        viewModelScope.launch {
            try {
                val responce=RetrofitClient.productService.getProduct()
                val productResponce= responce.products
                for (product in productResponce) {
                    Log.d("ProductViewModel",
                        "title:${product.title},"+
                           "\ndescription: ${product.description}"+
                           "\nprice: ${product.price}"
                    )
                }
            }
            catch (ex: Exception) {
                Log.d("ProductViewModel","${ex.message}")
            }
        }
    }
}
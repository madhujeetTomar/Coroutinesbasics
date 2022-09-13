package com.mj.coroutinesbasics.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mj.coroutinesbasics.helper.DatabaseHelper
import kotlinx.coroutines.launch

class RDViewModel(private val dbHelper: DatabaseHelper) : ViewModel() {

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            try {
                val usersFromDb = dbHelper.getAll()

                // here you have your usersFromDb

            } catch (e: Exception) {
                // handler error
            }
        }
    }

}
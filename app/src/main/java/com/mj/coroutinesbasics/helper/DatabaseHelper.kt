package com.mj.coroutinesbasics.helper

import com.mj.coroutinesbasics.model.entity.User

interface DatabaseHelper {

    suspend fun getAll():List<User>
    suspend fun insertAll(users : List<User>)
}
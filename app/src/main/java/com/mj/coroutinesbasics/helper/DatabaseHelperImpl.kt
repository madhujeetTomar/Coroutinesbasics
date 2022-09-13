package com.mj.coroutinesbasics.helper

import com.mj.coroutinesbasics.model.local.AppDatabase
import com.mj.coroutinesbasics.model.entity.User

class DatabaseHelperImpl(private val appDatabase: AppDatabase) : DatabaseHelper {
    override suspend fun getAll(): List<User> {
        return appDatabase.userDao().getAll()
    }

    override suspend fun insertAll(users: List<User>) {
        appDatabase.userDao().insertAll(users)
    }
}
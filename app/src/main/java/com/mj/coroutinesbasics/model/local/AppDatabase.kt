package com.mj.coroutinesbasics.model.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mj.coroutinesbasics.model.entity.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao


}
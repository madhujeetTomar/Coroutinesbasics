package com.mj.coroutinesbasics.model.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.mj.coroutinesbasics.model.entity.User

@Dao
interface UserDao {

    @Query("Select * FROM user")
    suspend fun getAll(): List<User>

    @Insert
    suspend fun insertAll(users : List<User>)

    @Delete
    suspend fun delete(user: User)


}
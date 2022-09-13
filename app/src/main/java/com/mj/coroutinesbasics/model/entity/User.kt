package com.mj.coroutinesbasics.model.entity

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class User(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "email") val email: String?,
)

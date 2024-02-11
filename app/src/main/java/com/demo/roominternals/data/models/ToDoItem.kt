package com.demo.roominternals.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Room

@Entity
data class ToDoItem(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val description: String,
    val isComplete: Boolean,
    val createdAt: Long
)


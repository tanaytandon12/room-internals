package com.demo.roominternals.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.demo.roominternals.data.models.ToDoItem

@Database(entities = [ToDoItem::class], version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun getDao(): DbDao
}
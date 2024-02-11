package com.demo.roominternals.data.repo

import com.demo.roominternals.data.db.DbDao
import com.demo.roominternals.data.models.ToDoItem
import kotlinx.coroutines.flow.Flow

class AppRepo constructor(private val dao: DbDao) {

    suspend fun insertItem(item: ToDoItem) {
        dao.insertItem(item)
    }

    suspend fun updateItem(item: ToDoItem) {
        dao.updateItem(item)
    }

    suspend fun removeItem(item: ToDoItem) {
        dao.removeItem(item)
    }

    fun fetchItems(): Flow<List<ToDoItem>> = dao.fetchItems()
}
package com.demo.roominternals.data.db

import android.content.Context
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Room
import androidx.room.Update
import com.demo.roominternals.data.models.ToDoItem
import kotlinx.coroutines.flow.Flow

@Dao
interface DbDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(item: ToDoItem): Long

    @Update(entity = ToDoItem::class)
    suspend fun updateItem(item: ToDoItem)

    @Delete(entity = ToDoItem::class)
    suspend fun removeItem(item: ToDoItem)

    @Query("select * from ToDoItem order by createdAt")
    fun fetchItems(): Flow<List<ToDoItem>>
}


fun appDbInstance(context: Context): AppDatabase =
    Room.databaseBuilder(context, AppDatabase::class.java, "app_db").build()
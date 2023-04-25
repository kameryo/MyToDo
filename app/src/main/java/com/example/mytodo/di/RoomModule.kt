package com.example.mytodo.di

import android.content.Context
import androidx.room.Room
import com.example.mytodo.model.todo.ToDoDAO
import com.example.mytodo.model.todo.ToDoDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    @Provides
    @Singleton
    fun provideToDoDatabase(@ApplicationContext context: Context): ToDoDatabase {
        return Room.databaseBuilder(
            context,
            ToDoDatabase::class.java,
            "todo_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideToDoDAO(database: ToDoDatabase): ToDoDAO {
        return database.todoDAO()
    }
}

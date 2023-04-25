package com.example.mytodo.di

import com.example.mytodo.model.todo.ToDoDAO
import com.example.mytodo.repository.todo.ToDoRepository
import com.example.mytodo.repository.todo.ToDoRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideToDoRepository(dao: ToDoDAO): ToDoRepository {
        return ToDoRepositoryImpl(dao)
    }
}

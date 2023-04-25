package com.example.mytodo.di

import androidx.room.Room
import com.example.mytodo.MainViewModel
import com.example.mytodo.model.todo.ToDoDatabase
import com.example.mytodo.page.create.CreateToDoViewModel
import com.example.mytodo.repository.todo.ToDoRepository
import com.example.mytodo.repository.todo.ToDoRepositoryImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { CreateToDoViewModel(get()) }
    single<ToDoRepository> { ToDoRepositoryImpl(get()) }
    single {
        Room.databaseBuilder(
            get(),
            ToDoDatabase::class.java,
            "todo_database"
        ).build()
    }
    single { get<ToDoDatabase>().todoDAO() }
}

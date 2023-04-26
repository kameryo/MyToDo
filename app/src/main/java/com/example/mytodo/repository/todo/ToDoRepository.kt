package com.example.mytodo.repository.todo

import com.example.mytodo.model.todo.ToDo
import kotlinx.coroutines.flow.Flow

interface ToDoRepository {
    fun getAll(): Flow<List<ToDo>>
    suspend fun create(title: String, detail: String)

}
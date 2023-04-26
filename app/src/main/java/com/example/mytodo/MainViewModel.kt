package com.example.mytodo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.mytodo.repository.todo.ToDoRepository

class MainViewModel(
    private val repo: ToDoRepository
): ViewModel() {

    val todoList = repo.getAll().asLiveData()
}
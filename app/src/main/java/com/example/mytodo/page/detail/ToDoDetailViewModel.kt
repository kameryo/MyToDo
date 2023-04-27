package com.example.mytodo.page.detail

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.mytodo.model.todo.ToDo

class ToDoDetailViewModel(
    savedStateHandle: SavedStateHandle
): ViewModel() {
    val todo = savedStateHandle.getLiveData<ToDo>("todo")
}
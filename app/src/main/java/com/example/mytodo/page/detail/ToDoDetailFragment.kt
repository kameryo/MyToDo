package com.example.mytodo.page.detail

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.mytodo.R
import org.koin.android.ext.android.inject

class ToDoDetailFragment : Fragment(R.layout.todo_detail_fragment) {
    private val vm: ToDoDetailViewModel by inject()
}

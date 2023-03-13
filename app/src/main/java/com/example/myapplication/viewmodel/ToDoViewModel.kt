package com.example.myapplication.viewmodel

import androidx.lifecycle.ViewModel

class ToDoViewModel: ViewModel() {
    val todos = mutableListOf<String>()

    init {
        todos.add("Test 1")
        todos.add("Test 2")
        todos.add("Test 3")
    }
}
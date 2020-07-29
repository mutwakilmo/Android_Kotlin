package com.mutwaakil.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var todoList = mutableListOf(
            Todo("Follow AndroidDevs",false),
            Todo("Feed my cat ",true),
            Todo("Eat HelloFresh",true),
            Todo("Learn Kotlin",true),
            Todo("Learn Data structure and algorithm",false),
            Todo("Take a shower",false)
        )
        val adapter = TodoAdapter(todoList)
        rvTodos.adapter =adapter
        rvTodos.layoutManager = LinearLayoutManager(this)

        btnAddTodo.setOnClickListener {
            val title = etTodo.text.toString()
            val todo = Todo(title, false)
            todoList.add(todo)

            adapter.notifyItemInserted(todoList.size -1)
        }
    }
}
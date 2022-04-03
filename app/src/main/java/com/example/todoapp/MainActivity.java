package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static String TAG = MainActivity.class.getSimpleName();

    private Repository repository;

    private List<Todo> todoList;

    private RecyclerView recyclerView;

    private TodoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.list);

        repository = Repository.getInstance();
        todoList = repository.getAllTodos();

       adapter = new TodoAdapter(todoList);
       recyclerView.setAdapter(adapter);

    }
}
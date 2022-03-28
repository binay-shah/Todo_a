package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static String TAG = MainActivity.class.getSimpleName();

    private Repository repository;

    private List<Todo> todoList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repository = Repository.getInstance();

        Log.d(TAG, "all todos size: "+repository.getAllTodos().size());
        todoList = repository.getAllTodos();
        for (Todo item: todoList){
            Log.d(TAG, "todo: "+item);
        }
    }
}
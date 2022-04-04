package com.example.todoapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface  TodoDao {

    @Query("select * from todos")
    public List<Todo> getAllTodos();

    @Delete
    public void delete(Todo todo);

    @Update
    public void update(Todo todo);

    @Query("select * from todos where id = :id")
    public Todo getTodoById(int id);


}

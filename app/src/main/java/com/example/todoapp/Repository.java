package com.example.todoapp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Repository {

    private List<Todo> todoList;

    private static Repository INSTANCE;

    private  Repository() {
        todoList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Todo todo = new Todo();
            todo.setTitle("todo"+i);
            todoList.add(todo);
        }
    }

    public static Repository getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Repository();
        }
        return INSTANCE;
    }

    public List<Todo> getAllTodos(){
        return todoList;
    }

    public Todo getTodoByID(UUID id){
        for(Todo item : todoList){
            if(item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public void insert(Todo todo){
        todoList.add(todo);
    }

    public void delete(UUID id){
        for(Todo item : todoList){
            if(item.getId() == id){
                todoList.remove(item);
            }
        }
    }

    public void update(Todo todo){
        Todo oldTodo = getTodoByID(todo.getId());
        oldTodo.setTitle(todo.getTitle());
        oldTodo.setDescription(todo.getDescription());
    }
}

package de.fbeutel.todolist.todo.service;

import de.fbeutel.todolist.todo.domain.Todo;
import de.fbeutel.todolist.todo.domain.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoListService {

    private final TodoRepository todoRepository;

    public TodoListService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public void add(final Todo todo) {
        todoRepository.save(todo);
    }

    public List<Todo> findAll() {
        return todoRepository.findAll();
    }
}

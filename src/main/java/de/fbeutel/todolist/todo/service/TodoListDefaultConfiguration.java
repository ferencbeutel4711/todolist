package de.fbeutel.todolist.todo.service;

import de.fbeutel.todolist.todo.domain.Todo;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Configuration
public class TodoListDefaultConfiguration {

    private final TodoListService todoListService;

    public TodoListDefaultConfiguration(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @PostConstruct
    public void defaultTodoList() {
        todoListService.add(Todo.builder()
                .name("Staubsaugen")
                .room("Mein Zimmer")
                .dueDate(LocalDate.now())
                .build());
        todoListService.add(Todo.builder()
                .name("Aufräumen")
                .room("Küche")
                .dueDate(LocalDate.now())
                .build());
    }
}

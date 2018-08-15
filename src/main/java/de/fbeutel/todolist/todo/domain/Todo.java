package de.fbeutel.todolist.todo.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
@Builder(toBuilder = true)
public class Todo {

    @Id
    private final String name;

    private final String room;
    private final LocalDate dueDate;

    public String formattedDueDate() {
        return dueDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }
}

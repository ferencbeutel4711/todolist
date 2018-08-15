package de.fbeutel.todolist.todo.web;

import de.fbeutel.todolist.todo.service.TodoListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Controller
@RequestMapping("/todos")
public class TodoListHtmlController {

    private final TodoListService todoListService;

    public TodoListHtmlController(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    @GetMapping
    public ModelAndView getTodoListPage() {
        final Map<String, Object> model = new ConcurrentHashMap<>();
        model.put("todos", todoListService.findAll());

        return new ModelAndView("todoListPage", model);
    }
}

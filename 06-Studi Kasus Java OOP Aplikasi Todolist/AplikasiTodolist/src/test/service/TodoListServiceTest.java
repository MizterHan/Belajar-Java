package test.service;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

    public static void main(String[] args) {
        testRemoveTodolist();
    }

    public static void testShowTodolist() {
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new Todolist("Belajar Java Dasar");
        todoListRepository.data[1] = new Todolist("Belajar Java OOP");
        todoListRepository.data[2] = new Todolist("Belajar Java Standard Class");


        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodolist() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Jaba OOP");
        todoListService.addTodoList("Belajar Java Standard Class");

        todoListService.showTodoList();
    }

    public static void testRemoveTodolist() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Jaba OOP");
        todoListService.addTodoList("Belajar Java Standard Class");

        todoListService.showTodoList();

        todoListService.removeTodolist(5);
        todoListService.removeTodolist(2);

        todoListService.showTodoList();

        todoListService.removeTodolist(2);

        todoListService.showTodoList();

        todoListService.removeTodolist(2);

        todoListService.showTodoList();

        todoListService.removeTodolist(1);

        todoListService.showTodoList();
    
    }

}

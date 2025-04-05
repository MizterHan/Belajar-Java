package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {

    public static void main(String[] args) {

        testRemoveTodolist();

    }

    public static void testShowTodolist() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);


        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Jaba OOP");
        todoListService.addTodoList("Belajar Java Standard Class");

        todoListView.showTodolist();

        

    }



    public static void testAddTodolist() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);


        todoListView.addTodolist();

        todoListService.showTodoList();

        todoListView.addTodolist();

        todoListService.showTodoList();

    }

    public static void testRemoveTodolist() {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);


        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Jaba OOP");
        todoListService.addTodoList("Belajar Java Standard Class");


        todoListService.showTodoList();

        todoListView.removeTodolist();

        todoListService.showTodoList();

        

    }

}

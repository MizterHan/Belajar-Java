
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class ApplikasiTodolistV2 {

    public static void main(String[] args) {
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);

        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodolist();
    }

}

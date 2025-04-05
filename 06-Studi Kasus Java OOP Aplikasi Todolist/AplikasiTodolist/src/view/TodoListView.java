package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {

    private TodoListService todoListService;

    //constructor dengan parameter TodoListService
    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }


    public void showTodolist(){
        while (true) {
            todoListService.showTodoList();

        System.out.println("Menu : ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("x. keluar");

        var input = InputUtil.input("Pilih");

        if (input.equals("1")) {
            addTodolist();
        } else if (input.equals("2")) {
            removeTodolist();
        } else if(input.equals("x")){
            break; 
        } else {
            System.out.println("Pilihan tidak dimengerti");
        }
        }

    }

    public void addTodolist(){
        System.out.println("Menambah Todolist");

        var todo = InputUtil.input("Todo (x jika batal)");

        if (todo.equals("x")) {
        }else{
            todoListService.addTodoList(todo);
        }

    }

    public void removeTodolist(){
        System.out.println("Menghapus Todolist");
        var number = InputUtil.input("(Nomor yang dihapus(x jika batal))");

        if (number.equals("x")) {
        }else {
            todoListService.removeTodolist(Integer.valueOf(number));
        }

    }

}

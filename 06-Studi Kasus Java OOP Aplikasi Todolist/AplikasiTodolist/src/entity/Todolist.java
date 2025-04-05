package entity;

public class Todolist {

    private String todo;

    public Todolist() {
        
    }

    //constructor
    public Todolist(String todo) {
        this.todo = todo;
    }

    //getter
    public String getTodo() {
        return todo;
    }    

    //setter
    public void setTodo(String todo) {
        this.todo = todo;
    }

}

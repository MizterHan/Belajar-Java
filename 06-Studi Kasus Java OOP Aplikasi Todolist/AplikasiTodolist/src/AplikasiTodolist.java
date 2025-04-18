public class AplikasiTodolist {

    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {

        viewShowTodolist();
    }

    /*
     * Menampilkan todo list
     */

    public static void showTodolist() {
        System.out.println("TODOLIST : ");
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if (todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodolist() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
        showTodolist();
    }

    /*
     * Menambah todo ke list
     */
    public static void addTodoList(String todo) {
        // cek apakah model penuh?
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if (model[i] == null) {
                // model[i] = todo;
                isFull = false;
                break;
            }
        }

        // jika model penuh, kita resize ukuran array 2x lipat
        if (isFull) {
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }
        // tambahkan ke posisi yang data array nya NULL
        for (var i = 0; i < model.length; i++) {
            if (model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodolist() {
        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh Todo ke " + i);
        }
        showTodolist();
    }

    /*
     * Menghapus todo list
     */
    public static boolean removeTodolist(Integer number) {
        if ((number - 1) >= model.length) {
            return false;
        } else if (model[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < model.length; i++) {
                if (i == model.length - 1) {
                    model[i] = null;
                } else {
                    model[i] = model[i + 1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodolist() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        var result = removeTodolist(20);
        System.out.println(result);

        result = removeTodolist(7);
        System.out.println(result);

        result = removeTodolist(2);
        System.out.println(result);

        showTodolist();

    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;

    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hello " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    /*
     * Menampilkan view todo list
     */
    public static void viewShowTodolist() {
        while (true) {
            showTodolist();

        System.out.println("Menu : ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("x. keluar");

        var input = input("Pilih");

        if (input.equals("1")) {
            viewAddTodolist();
        } else if (input.equals("2")) {
            viewRemoveTodolist();
        } else if(input.equals("x")){
            break; 
        } else {
            System.out.println("Pilihan tidak dimengerti");
        }
        }
    }

    public static void testViewShowTodolist() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");
        addTodoList("empat");
        addTodoList("lima");

        viewShowTodolist();

    }

    /*
     * Menampilkan view menambah todolist
     */
    public static void viewAddTodolist() {
        System.out.println("Menambah Todolist");

        var todo = input("Todo (x jika batal)");

        if (todo.equals("x")) {
        }else{
            addTodoList(todo);
        }
    }

    public static void testViewAddTodolist() {
        addTodoList("satu");
        addTodoList("dua");
        viewAddTodolist();

        showTodolist();
    }

    /*
     * Menampilkan view menghapus todolist
     */
    public static void viewRemoveTodolist() {
        System.out.println("Menghapus Todolist");
        var number = input("(Nomor yang dihapus(x jika batal))");

        if (number.equals("x")) {
        }else{
            boolean succes = removeTodolist(Integer.valueOf(number));

            if (!succes) {
                System.out.println("Gagal menghapus todolist nomor " + number);
            }
        }
    }

    public static void testViewRemoveTodolist() {
        addTodoList("satu");
        addTodoList("dua");
        addTodoList("tiga");

        showTodolist();

        viewRemoveTodolist();

        showTodolist();
    }
}
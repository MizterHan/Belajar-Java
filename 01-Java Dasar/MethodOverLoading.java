public class MethodOverLoading {
    public static void main(String[] args) {

        sayHello();

        sayHello("Eko");

        sayHello("Eko", "Khannedy");

    }

    public static void sayHello() {
        System.out.println("Hello");

    }

    public static void sayHello(String name) {
        System.out.println("Hello " + name);

    }

    public static void sayHello(String name, String lastName) {
        System.out.println("Hello " + name + " " + lastName);
    }
}

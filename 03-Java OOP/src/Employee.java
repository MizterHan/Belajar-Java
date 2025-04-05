class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hii " + name + ", my name is Employee " + this.name);
    }
}

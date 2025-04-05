class VicePresident extends Manager {


    VicePresident(String name) {
        super(name);
    }
    void sayHello(String name) {
        System.out.println("Hii " + name + ", my name is VP " + this.name);
    }
}

package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {
        
        MyData<String> stringMyData = new MyData<String>("Eko");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        stringMyData.getData();
        integerMyData.getData();

        System.out.println(stringMyData.getData());
        System.out.println(integerMyData.getData());
    }

}

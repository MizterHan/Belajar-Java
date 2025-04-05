package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class InvariantApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Eko");

        //doIt(stringMyData); //Error\
        //MyData<Object> objectMyData = stringMyData; //Error
    }

    public static void doIt(MyData<Object> myData) { 
        // do something

    }
}

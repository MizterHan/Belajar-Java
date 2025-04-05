package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class TypeerasureApp {

    public static void main(String[] args) {
        MyData myData = new MyData("Eko");

        MyData<Integer> integerMyData = (MyData<Integer>) myData;

        Integer integer = integerMyData.getData();
    }

}

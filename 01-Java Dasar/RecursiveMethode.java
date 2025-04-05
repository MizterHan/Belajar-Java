public class RecursiveMethode {
    public static void main(String[] args) {

        System.out.println(factorialLoop(10));
        System.out.println(factorialRecursive(10));

        loop(10000);
    }

    public static int factorialLoop(int value) {
        var result = 1;
        for(var counter = 1; counter <= value; counter++) {
            result *= counter;
        }

        return result;
    }

    public static int factorialRecursive(int value) {
        if  (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }


    public static void loop(int value) {
        if(value == 0) {
            System.out.println("Done");
        } else {
            System.out.println("loop" + value);
            loop(value - 1);
        }
    }
}

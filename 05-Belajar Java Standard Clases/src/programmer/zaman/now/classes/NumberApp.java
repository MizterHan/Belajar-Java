




public class NumberApp {

    public static void main(String[] args) {

        Integer intvalue = 10;

        Long longvalue = intvalue.longValue();
        Double doubleValue = longvalue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "100.100";

        Double contohInt = Double.valueOf(contoh);
        System.out.println(contohInt);
    }

}

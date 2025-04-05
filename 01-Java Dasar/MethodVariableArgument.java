public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = { 50, 50, 50, 100 };
        sayCongrats("Eko", values);

        sayCongrats("Budi", 88, 75, 90, 95, 100);
    }

    public static void sayCongrats(String name, int... values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }
        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", anda lulus!");
        } else {
            System.out.println("Maaf " + name + ", anda harus remedial!");
        }
    }
}

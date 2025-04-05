
import java.util.Arrays;



public class ArrayApp {

    public static void main(String[] args) {
        int[] NumberRandom = {
            1 , 4, 2, 5, 7, 6, 9, 8, 3, 10
        };

        Arrays.sort(NumberRandom);
        System.out.println(Arrays.toString(NumberRandom));

        System.out.println(Arrays.binarySearch(NumberRandom, 5));
        System.out.println(Arrays.binarySearch(NumberRandom, 10));

        int[] result = Arrays.copyOfRange(NumberRandom, 5, 10);
        System.out.println(Arrays.toString(result));
    }

}

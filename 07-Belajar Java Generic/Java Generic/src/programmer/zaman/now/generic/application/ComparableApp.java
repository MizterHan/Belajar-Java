package programmer.zaman.now.generic.application;
import java.lang.reflect.Array;
import java.util.Arrays;
import programmer.zaman.now.generic.Person;
import programmer.zaman.now.generic.util.ArrayHelper;
public class ComparableApp {

    public static void main(String[] args) {

        Person[] people = {
            new Person("Eko", "Malang"),
            new Person("Budi", "Surabaya"),
            new Person("Andi", "Surabaya"),
        };

        Arrays.sort(people); // sort berdasarkan name

        System.out.println(Arrays.toString(people));
    }

}


import java.util.Scanner;

public class ScannerApp {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String name = scanner.nextLine();

        System.out.print("Masukkan Umur : ");
        int age = scanner.nextInt();

        System.out.println("Hallo Nama Saya : " + name);
        System.out.println("Umur Saya : " + age);
    }

}

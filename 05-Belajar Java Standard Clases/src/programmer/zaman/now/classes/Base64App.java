import java.util.Base64;

public class Base64App {

    public static void main(String[] args) {
        String original = "Eko Kurniawan Khannedy";

        byte[] bytes = original.getBytes();
        String encoded = Base64.getEncoder().encodeToString(bytes);
        System.out.println(encoded);

        String decoded = new String(Base64.getDecoder().decode(encoded));
        System.out.println(decoded);
    }

}

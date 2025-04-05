
import java.util.StringTokenizer;



public class StringTokenizerApp {

    public static void main(String[] args) {

        String value = "Eko Kurniawan Khannedy";
        
        StringTokenizer tokenizer = new StringTokenizer(value, ", ");

        while ((tokenizer.hasMoreTokens())) {
            System.out.println(tokenizer.nextToken());
        }
    }

}

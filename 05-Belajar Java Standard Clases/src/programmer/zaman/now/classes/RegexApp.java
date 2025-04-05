
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {

    public static void main(String[] args) {

        String name = "Eko Kurniawan Khannedy Programmer Zaman Now";

        Pattern pattern = Pattern.compile("[a-zA-Z]*[a][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);

        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

}

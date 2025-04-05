import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        

        try {
            Properties properties = System.getProperties();
            properties.load(new FileInputStream("application.properties"));

            String host = properties.getProperty("database.host");
            String port = properties.getProperty("database.port");
            String user = properties.getProperty("database.user");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(user);
            System.out.println(password);

        } catch (FileNotFoundException exception) {
            System.out.println("File tidak ditemukan");
        } catch (IOException exception) {
            System.out.println("Gagal membaca file");
        }






        try {
            Properties properties = new Properties();
            properties.put("name.first", "Eko");
            properties.put("name.middle", "Kurniawan");
            properties.put("name.last", "Khannedy");

            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");
        } catch (FileNotFoundException exception) {
            System.out.println("Error membuat file properties");
        } catch (IOException exception) {
            System.out.println("Error menyimpan file properties");
        }

    }
}

public class Variabel {
    public static void main(String[] args) {
        String name;
        name = "Eko Kurniawan Khannedy";

        int age = 30;
        String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        
        name = "Budi Nugraha";
        System.out.println(name);

        var firstName = "Eko";
        var middlename = "Kurniawan";
        var lastName = "Khannedy";

        var fullName = firstName + " " + middlename + " " + lastName;
        System.out.println(fullName);


        final String application = "Belajar Java";
        System.out.println(application);
    }
}

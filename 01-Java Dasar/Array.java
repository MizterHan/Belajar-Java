public class Array {
    
    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Eko";
        stringArray[1] = "Kurniawan";
        stringArray[2] = "Khannedy";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Budi";

        System.out.println(stringArray[0]);

        String[] namNama = {
            "Eko",
            "Kurniawan",
            "Khannedy"
        };

        int[] arrayInt = new int[]{
            1, 2, 3, 4, 5
        };

        long[] arrayLong = new long[]{
            100000000L, 200000000L, 300000000L, 400000000L, 500000000L
        };


        System.out.println(arrayLong.length);

        String[][] members = {
            {"Eko", "Kurniawan", "Khannedy"},
            {"Budi", "Nugraha", "Mizter"}
        };

        System.out.println(members[1][2]);



    }
}

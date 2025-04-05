public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("WOW, anda lulus dengan baik!");
                break;
            case "B":
            case "C":
                System.out.println("Nilai Anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        System.out.println("Switch Lambda: ");
        switch (nilai) {
            case "A" -> System.out.println("WOW, anda lulus dengan baik!");
            case "B", "C" -> System.out.println("Nilai Anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> System.out.println("Mungkin anda salah jurusan");
        }


        System.out.println("Switch Tanpa Yield: ");

        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "WOW, anda lulus dengan baik!";
            case "B", "C" -> ucapan = "Nilai Anda cukup baik";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> { 
                ucapan = "Mungkin anda salah jurusan";
            }
        }
        System.out.println(ucapan);


        System.out.println("Switch dengan Yield: ");

        ucapan = switch (nilai) {
            case "A" :
                yield "WOW, anda lulus dengan baik!";
            case "B", "C" :
                yield "Nilai Anda cukup baik";
            case "D" :
                yield "Anda tidak lulus";
            default :
                yield "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan);




    }
}

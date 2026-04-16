import java.util.Scanner;
public class latihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float K, N;
        String g="";

        System.out.print("Masukan kehadiran : ");
        K = input.nextFloat();

        System.out.print("Masukan nilai akhir : ");
        N = input.nextFloat();

        if (K >= 75) {
            if (N>=80) {
                g ="A";
            } else if (N>=70){
                g ="B";
            } else if (N>=60) {
                g = "c";
            } else {
                g = "D";
            }

            System.out.println("Nilai : " + N);
            System.out.println("Grade :" + g);
        } else {
            if (N>=55) {
                g="D";
            } else {
                g="E";
            }

            System.out.println("Nilai : " + N);
            System.out.println("Grade : " + g);
            System.out.println("kamu tidak lulus karena kehadiran kurang");
        }
    }
}

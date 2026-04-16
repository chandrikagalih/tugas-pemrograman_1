import java.util.Scanner;

public class latihan_pertemuan4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input kehadiran : ");
        float kehadiran = input.nextFloat();

        System.out.print("input Tugas : ");
        float tugas = input.nextFloat();

        System.out.print("input UTS : ");
        float uts = input.nextFloat();

        System.out.print("input UAS : ");
        float uas = input.nextFloat();

        float b_kehadiran = kehadiran * 10 / 100;
        float b_tugas = tugas * 20 / 100;
        float b_uts = uts * 30 / 100;
        float b_uas = uas * 40 / 100;

        float total = b_kehadiran + b_tugas + b_uas + b_uts;
        
        System.out.println("Total nilai : " + total);
        
        input.close();

    }
}
import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // S1: Input
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        // P1: Proses (contoh: dikali 2)
        int hasil = angka * 2;

        // S2: Output
        System.out.println("Hasil: " + hasil);
    }
}
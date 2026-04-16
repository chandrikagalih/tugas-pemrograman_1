import java.util.Scanner;

public class pengeluaran3hari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalSemuaHari = 0;

        for (int hari = 1; hari <= 3; hari++) {
            System.out.println("\n=== Hari ke-" + hari + " ===");

            System.out.print("Makan: ");
            double makan = input.nextDouble();

            System.out.print("Transport: ");
            double transport = input.nextDouble();

            System.out.print("Belanja: ");
            double belanja = input.nextDouble();

            double total = makan + transport + belanja;
            totalSemuaHari += total;

            // Persentase
            double pMakan = (makan / total) * 100;
            double pTransport = (transport / total) * 100;
            double pBelanja = (belanja / total) * 100;

            // Output per hari
            System.out.println("\n--- Laporan Hari ke-" + hari + " ---");
            System.out.println("Total: " + total);
            System.out.println("Makan: " + pMakan + "%");
            System.out.println("Transport: " + pTransport + "%");
            System.out.println("Belanja: " + pBelanja + "%");
        }

        // Output total 3 hari
        System.out.println("\n=== LAPORAN 3 HARI ===");
        System.out.println("Total Pengeluaran 3 Hari: " + totalSemuaHari);

        input.close();
    }
}
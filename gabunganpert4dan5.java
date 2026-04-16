import java.util.Scanner;

public class gabunganpert4dan5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //variabel
        float kehadiran, tugas, uts, uas;
        float total;
        int validasi = 16; //minimal hadir dari 21 pertemuan
        String grade = "";
        
        //input
        System.out.print("masukan kehadiran : ");
        kehadiran = input.nextFloat();

        System.out.print("Masukan nilai tugas : ");
        tugas = input.nextFloat();

        System.out.print("Masukan nilai UTS : ");
        uts = input.nextFloat();

        System.out.print("Masukan nilai UAS : ");
        uas = input.nextFloat();

        //proses validasi nilai
        float b_kehariran = kehadiran * 10 / 100;
        float b_tugas = tugas * 20 / 100;
        float b_uts = uts * 30 /100;
        float b_uas = uas * 30 /100;

        total = b_kehariran + b_tugas + b_uas + b_uts;

        //proses logika kehadiran + grade 
        if(kehadiran<validasi) {
            //kehadiran kurang
            if(total>=55){
                grade = "D";
            } else {
                grade = "E";
            }
            System.out.println("\nTotal nilai : " + total);
            System.out.println("Grade : " + grade);
            System.out.println("Tidak lulus karena kehadiran kurang");

        } else {
            //kehadiran cukup
            if (total>=80) {
                grade = "A";
            } else if (total>=70) {
                grade = "B";
            } else if (total>= 60) {
                grade = "C";
            } else {
                grade = "D";
            }
            System.out.println("\nTotal nilai : " + total);
            System.out.println("Grade :  " + grade);
        }  
        input.close(); 
    }
}

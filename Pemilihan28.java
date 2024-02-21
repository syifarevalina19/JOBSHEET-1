import java.util.Scanner;

public class Pemilihan28 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=======================");
        System.out.print("Masukkan nilai Tugas: ");
        int nilaiTugas = input08.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        int nilaiKuis = input08.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        int nilaiUTS = input08.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        int nilaiUAS = input08.nextInt();

        if (nilaiTugas < 0 || nilaiTugas > 100 ||
            nilaiKuis < 0 || nilaiKuis > 100 ||
            nilaiUTS < 0 || nilaiUTS > 100 ||
            nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("=======================");
            System.out.println("=======================");
            System.out.println("Nilai tidak valid!");
            System.out.println("=======================");
            System.out.println("=======================");
            return;
        }

        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);

        String nilaiHuruf;
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 73) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir >= 65) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 39) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        double nilaiSetara;
        switch (nilaiHuruf) {
            case "A":
                nilaiSetara = 4;
                break;
            case "B+":
                nilaiSetara = 3.5;
                break;
            case "B":
                nilaiSetara = 3;
                break;
            case "C+":
                nilaiSetara = 2.5;
                break;
            case "C":
                nilaiSetara = 2;
                break;
            case "D":
                nilaiSetara = 1;
                break;
            default:
                nilaiSetara = 0;
                break;
        }

        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("======================");
        System.out.println("======================");

        String keterangan;
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
            nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
            keterangan = "SELAMAT ANDA LULUS";
        } else {
            keterangan = "ANDA TIDAK LULUS";
        }
        System.out.println(keterangan);
    }
}

import java.util.Scanner;

public class Perulangan28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array untuk Nilai Mutu dan Nilai Setara
        double[] nilaiSetara = {0, 1, 2, 2.5, 3, 3.5, 4};
        String[] namaMatkul = new String[5];
        int[] bobotSKS = new int[5];
        char[] nilaiHuruf = new char[5];

        int totalSKS = 0;
        double totalNilaiSetara = 0;

        // Input data untuk 5 mata kuliah
        for (int i = 0; i < 5; i++) {
            System.out.println("Masukkan Nama Mata Kuliah ke-" + (i + 1) + ":");
            namaMatkul[i] = scanner.nextLine();

            System.out.println("Masukkan jumlah SKS untuk " + namaMatkul[i] + ":");
            bobotSKS[i] = scanner.nextInt();
            totalSKS += bobotSKS[i];

            System.out.println("Masukkan nilai untuk " + namaMatkul[i] + " (A, A-, B+, dll):");
            scanner.nextLine(); // Mengonsumsi newline
            nilaiHuruf[i] = scanner.nextLine().toUpperCase().charAt(0);

            // Menghitung Nilai Setara
            for (int j = 0; j < nilaiSetara.length; j++) {
                if (nilaiHuruf[i] == ('A' + j)) {
                    totalNilaiSetara += nilaiSetara[j] * bobotSKS[i];
                    break;
                }
            }
        }

        // Menghitung dan menampilkan IP Semester
        double ipSemester = totalNilaiSetara / totalSKS;
        System.out.printf("IP Semester adalah: %.2f%n", ipSemester);
    }
}

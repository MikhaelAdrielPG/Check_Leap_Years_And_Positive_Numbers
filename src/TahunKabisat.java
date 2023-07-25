import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        /*
         * Tahun kabisat adalah tahun yang memiliki jumlah hari 366,
         * yaitu tahun yang dapat dibagi habis oleh 4.
         * Namun, terdapat pengecualian,
         * yaitu tahun yang habis dibagi 100 tidak merupakan tahun kabisat,
         * kecuali tahun yang habis dibagi 400
         * */

        // Membaca tahun / input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = scanner.nextInt();

        // Menampilkan hasil dari pengecekkan
        if (cekTahunKabisat(tahun)) {
            System.out.println("Tahun " + tahun + " adalah tahun kabisat.");
        } else {
            System.out.println("Tahun " + tahun + " bukan tahun kabisat.");
        }
    }

    public static boolean cekTahunKabisat(int tahun) {
        // Memeriksa apakah tahun kabisat atau tidak
        if ((tahun % 4 == 0) && ((tahun % 100 != 0) || (tahun % 400 == 0))) {
            return true;
        } else {
            return false;
        }
    }
}
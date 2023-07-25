import java.util.Scanner;

public class BilanganPositif {
    public static void main(String[] args) {
        /*
        * Bilangan positif adalah bilangan bulan yang lebih besar dari 0.
        * Bilangan tersebut harus memenuhi dua kondisi sekaligus,
        * yaitu harus habis dibagi 3 dan 5 secara bersamaan.
        * */

        // Membaca bilangan / input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();

        //  Menampilkan hasil dari pengecekkan
        if (cekBilanganPositif(bilangan)) {
            System.out.println("Bilangan " + bilangan + " memenuhi kondisi.");
        } else {
            System.out.println("Bilangan " + bilangan + " tidak memenuhi kondisi.");
        }
    }

    public static boolean cekBilanganPositif(int bilangan) {
        // Memeriksa apakah bilangan bulat positif habis dibagi 3 dan 5 secara bersamaan atau tidak
        return (bilangan > 0) && ((bilangan % 3 == 0) && (bilangan % 5 == 0));
    }
}

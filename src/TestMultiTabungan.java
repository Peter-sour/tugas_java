import java.text.NumberFormat;
import java.util.Locale;

/**
 * Kelas ini digunakan untuk menguji fungsionalitas kelas MultiTabungan.
 */
public class TestMultiTabungan {

    public static void main(String[] args) {
        // Membuat format penulisan mata uang Rupiah agar mudah dibaca
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        formatRupiah.setMaximumFractionDigits(0);

        // 1. Membuat objek tabungan baru dengan saldo awal Rp 1.000.000
        System.out.println("Membuat rekening baru...");
        MultiTabungan tabunganAndi = new MultiTabungan(1000000);
        System.out.println("Saldo awal: " + formatRupiah.format(tabunganAndi.getSaldo()));
        System.out.println("==============================================");

        // 2. Menyimpan 100 USD
        System.out.println("Menyimpan 100 USD (Kurs 1 USD = 9,000 IDR)...");
        tabunganAndi.simpanUang(100, "USD");
        System.out.println("Saldo sekarang: " + formatRupiah.format(tabunganAndi.getSaldo()));
        System.out.println("==============================================");

        // 3. Menyimpan 50 AUD
        System.out.println("Menyimpan 50 AUD (Kurs 1 AUD = 10,000 IDR)...");
        tabunganAndi.simpanUang(50, "AUD");
        System.out.println("Saldo sekarang: " + formatRupiah.format(tabunganAndi.getSaldo()));
        System.out.println("==============================================");

        // 4. Mengambil 2.000.000 IDR
        System.out.println("Mencoba mengambil 2,000,000 IDR...");
        tabunganAndi.ambilUang(2000000, "IDR");
        System.out.println("Saldo sekarang: " + formatRupiah.format(tabunganAndi.getSaldo()));
        System.out.println("==============================================");

        // 5. Mencoba mengambil uang lebih dari saldo yang ada (dalam USD)
        System.out.println("Mencoba mengambil 500 USD...");
        boolean statusTarik1 = tabunganAndi.ambilUang(500, "USD");
        System.out.println("Status penarikan: " + (statusTarik1 ? "Berhasil" : "Gagal"));
        System.out.println("Saldo akhir: " + formatRupiah.format(tabunganAndi.getSaldo()));
        System.out.println("==============================================");

        // 6. Mengambil 50 AUD
        System.out.println("Mencoba mengambil 50 AUD...");
        boolean statusTarik2 = tabunganAndi.ambilUang(50, "AUD");
        System.out.println("Status penarikan: " + (statusTarik2 ? "Berhasil" : "Gagal"));
        System.out.println("Saldo akhir: " + formatRupiah.format(tabunganAndi.getSaldo()));
        System.out.println("==============================================");
    }
}
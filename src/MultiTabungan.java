/**
 * Kelas MultiTabungan memungkinkan transaksi dalam berbagai mata uang (IDR, USD, AUD).
 * Semua saldo internal disimpan dalam mata uang IDR.
 */
public class MultiTabungan {

    // Kurs mata uang (dibuat sebagai konstanta)
    private static final int USD_TO_IDR = 9000;
    private static final int AUD_TO_IDR = 10000;

    // Atribut untuk menyimpan saldo, selalu dalam IDR.
    // Menggunakan tipe 'long' untuk menampung angka yang lebih besar.
    private long saldo;

    /**
     * Constructor untuk membuat objek MultiTabungan dengan saldo awal.
     * @param initsaldo Saldo awal dalam satuan IDR.
     */
    public MultiTabungan(long initsaldo) {
        this.saldo = initsaldo;
    }

    /**
     * Method untuk mendapatkan saldo saat ini.
     * @return Jumlah saldo dalam satuan IDR.
     */
    public long getSaldo() {
        return this.saldo;
    }

    /**
     * Method untuk menyimpan uang. Method ini akan mengkonversi jumlah uang
     * dari mata uang asing ke IDR sebelum ditambahkan ke saldo.
     * @param jumlah Jumlah uang yang akan disimpan.
     * @param mataUang Tipe mata uang ("IDR", "USD", atau "AUD").
     */
    public void simpanUang(double jumlah, String mataUang) {
        long jumlahDalamIDR = 0;

        // Konversi jumlah ke IDR berdasarkan mata uang yang dipilih
        switch (mataUang.toUpperCase()) {
            case "USD":
                jumlahDalamIDR = (long) (jumlah * USD_TO_IDR);
                break;
            case "AUD":
                jumlahDalamIDR = (long) (jumlah * AUD_TO_IDR);
                break;
            case "IDR":
                jumlahDalamIDR = (long) jumlah;
                break;
            default:
                System.out.println("Error: Mata uang " + mataUang + " tidak valid.");
                return; // Keluar dari method jika mata uang tidak valid
        }

        // Tambahkan jumlah yang sudah dikonversi ke saldo
        this.saldo += jumlahDalamIDR;
        System.out.println("Berhasil menyimpan " + jumlah + " " + mataUang + " (setara dengan " + jumlahDalamIDR + " IDR).");
    }

    /**
     * Method untuk mengambil uang. Method ini akan mengkonversi jumlah yang ingin diambil
     * ke IDR untuk memeriksa kecukupan saldo.
     * @param jumlah Jumlah uang yang akan diambil.
     * @param mataUang Tipe mata uang ("IDR", "USD", atau "AUD").
     * @return true jika penarikan berhasil, false jika saldo tidak mencukupi.
     */
    public boolean ambilUang(double jumlah, String mataUang) {
        long jumlahDalamIDR = 0;

        // Konversi jumlah ke IDR berdasarkan mata uang yang dipilih
        switch (mataUang.toUpperCase()) {
            case "USD":
                jumlahDalamIDR = (long) (jumlah * USD_TO_IDR);
                break;
            case "AUD":
                jumlahDalamIDR = (long) (jumlah * AUD_TO_IDR);
                break;
            case "IDR":
                jumlahDalamIDR = (long) jumlah;
                break;
            default:
                System.out.println("Error: Mata uang " + mataUang + " tidak valid.");
                return false; // Gagal karena mata uang tidak valid
        }

        // Cek apakah saldo mencukupi
        if (this.saldo >= jumlahDalamIDR) {
            this.saldo -= jumlahDalamIDR; // Kurangi saldo
            System.out.println("Berhasil mengambil " + jumlah + " " + mataUang + " (setara dengan " + jumlahDalamIDR + " IDR).");
            return true; // Penarikan berhasil
        } else {
            System.out.println("Gagal mengambil uang. Saldo tidak mencukupi.");
            return false; // Penarikan gagal
        }
    }
}
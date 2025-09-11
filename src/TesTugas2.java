public class TesTugas2 {
    public static void main(String args[]) {
        boolean status;
        Truk truk = new Truk(900);
        // Membuat objek truk dengan kapasitas 900 kg.

        System.out.println("Muatan maksimal = " + truk.getMuatanMaks());
        // Tambah muatan 500 kg → berhasil (Ok).

        status = truk.tambahMuatan(500.0);
        System.out.println("Tambah muatan : 500");
        if (status) System.out.println("Ok"); else System.out.println("Gagal");

        // Program simulasi pengisian muatan bertahap.

        status = truk.tambahMuatan(300.0);
        System.out.println("Tambah muatan : 300");
        if (status) System.out.println("Ok"); else System.out.println("Gagal");

        status = truk.tambahMuatan(150.0);
        System.out.println("Tambah muatan : 150");
        if (status) System.out.println("Ok"); else System.out.println("Gagal");

        status = truk.tambahMuatan(50.0);
        System.out.println("Tambah muatan : 50");
        if (status) System.out.println("Ok"); else System.out.println("Gagal");

        System.out.println("Muatan sekarang = " + truk.getMuatan());

        // Menampilkan muatan terakhir setelah semua percobaan.
    }
}
// Membuat objek Truk dengan kapasitas 900 kg.

// Menambah muatan bertahap: 500 → 300 → 150 → 50.

// Jika total melebihi kapasitas, program menampilkan "Gagal".

// Terakhir menampilkan jumlah muatan saat ini.
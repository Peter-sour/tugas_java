
public class TesKalender {
    public static String getTime(Kalender kal) {
        String tmp;
        tmp = kal.getTanggal() + "-" +
              kal.getBulan() + "-" +
              kal.getTahun();
        return tmp;
    }
    // Method bantu untuk format tanggal jadi string.

    public static void main(String args[]) {
        Kalender kal = new Kalender(8);
        System.out.println("Waktu awal : " + getTime(kal));
        // Membuat objek Kalender dengan tanggal 8-1-2000.

        kal.setTanggal(9);
        System.out.println("1 hari setelah waktu awal : " + getTime(kal));
        // Mengubah tanggal ke 9 dengan setter.

        kal = new Kalender(6, 2003);
        System.out.println("Waktu berubah : " + getTime(kal));
        // Membuat ulang objek dengan bulan & tahun baru 1-6-2003.

        kal.setBulan(7);
        System.out.println("1 bulan setelah itu : " + getTime(kal));

        kal = new Kalender(20, 10, 2004);
        System.out.println("Waktu berubah : " + getTime(kal));

        kal.setTahun(2005);
        System.out.println("1 tahun setelah itu : " + getTime(kal));
    }
}
// getTime() dipakai untuk format tanggal jadi string.

// Program mengetes semua constructor Kalender dan setter (setTanggal, setBulan, setTahun).

// Hasil yang keluar sesuai perubahan tanggal, bulan, tahun.
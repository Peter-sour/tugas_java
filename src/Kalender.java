public class Kalender {
    private int tanggal;
    private int bulan;
    private int tahun;

    // disini  Menyimpan atribut tanggal, bulan, tahun.
    // Atribut dibuat private → enkapsulasi

    // Konstruktor default (1-1-2000)
    public Kalender() {
        this.tanggal = 1;
        this.bulan = 1;
        this.tahun = 2000;
    }
    
    // Jika objek dibuat tanpa parameter, otomatis tanggal = 1-1-2000.

    // Konstruktor dengan parameter tanggal
    public Kalender(int tanggal) {

        this.tanggal = tanggal;
        this.bulan = 1;
        this.tahun = 2000;
    }

    // Konstruktor dengan parameter bulan dan tahun
    public Kalender(int bulan, int tahun) {
        this.tanggal = 1;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    // Konstruktor dengan parameter lengkap
    public Kalender(int tanggal, int bulan, int tahun) {
        this.tanggal = tanggal;
        this.bulan = bulan;
        this.tahun = tahun;
    }

//Ada beberapa constructor overload.

// Memudahkan inisialisasi dengan input berbeda.

    // Getter & Setter
    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    
    // Akses data dilakukan lewat getter/setter.
    // Contoh getTanggal() ambil tanggal, setTanggal() ubah tanggal.
}

// Atribut tanggal, bulan, tahun dibuat private agar enkapsulasi tercapai (tidak bisa diakses langsung dari luar).

// Ada 4 constructor berbeda sesuai UML class diagram (overloading).

// Method getter & setter dipakai untuk akses dan ubah data.
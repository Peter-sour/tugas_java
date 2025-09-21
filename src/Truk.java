public class Truk {
    private double muatan;       // dalam kilogram
    private double muatanMaks;   // dalam kilogram

    

    // Konstanta konversi
    private static final double GRAVITY = 9.8;

    // Menyimpan muatan dalam kg.

    // Konstanta GRAVITY untuk konversi Newton ↔ Kg.

    // Konstruktor
    public Truk(double beratmaks) {
        this.muatanMaks = beratmaks;
        this.muatan = 0.0;
    }
    // Konstruktor → truk dibuat dengan kapasitas maksimum tertentu.

    // Getter
    public double getMuatan() {
        return this.muatan;
    }

    public double getMuatanMaks() {
        return this.muatanMaks;
    }

    // Method tambah muatan
    public boolean tambahMuatan(double berat) {
        if (this.muatan + berat <= this.muatanMaks) {
            this.muatan += berat;
            return true;
        } else {
            return false;
        }
    }
    // Menambah muatan dengan validasi kapasitas.

    // Return true kalau berhasil, false kalau overload.

    // Konversi Newton -> Kilogram
    public double newtsToKilo(double berat) {
        return berat / GRAVITY;
    }

    // Konversi Kilogram -> Newton
    public double kiloToNewts(double berat) {
        return berat * GRAVITY;
    }
}
// muatan menyimpan muatan truk saat ini.

// muatanMaks adalah kapasitas maksimal truk.

// tambahMuatan(berat) menambahkan muatan jika tidak melebihi kapasitas → return true kalau sukses, false kalau gagal.

// Ada juga fungsi konversi berat:

// newtsToKilo() = Newton → Kilogram

// kiloToNewts() = Kilogram → Newton
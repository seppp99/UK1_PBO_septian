public class Kendaraan {
    private String merk;
    private int tahunProduksi;

    public Kendaraan() {
        this.merk = "Tidak diketahui";
        this.tahunProduksi = 0;
    }

    public Kendaraan(String merk, int tahunProduksi) {
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public void setTahunProduksi(int tahunProduksi) {
        this.tahunProduksi = tahunProduksi;
    }

    public void infoKendaraan() {
        System.out.println("Merk: " + merk + ", Tahun Produksi: " + tahunProduksi);
    }
}

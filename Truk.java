public class Truk extends Kendaraan {
    private int kapasitasMuatan;

    public Truk() {
        super();
        this.kapasitasMuatan = 0;
    }

    public Truk(String merk, int tahunProduksi, int kapasitasMuatan) {
        super(merk, tahunProduksi);
        this.kapasitasMuatan = kapasitasMuatan;
    }

    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan = kapasitasMuatan;
    }

    
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Kapasitas Muatan: " + kapasitasMuatan + " ton");
    }
}

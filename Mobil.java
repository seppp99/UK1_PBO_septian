public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil() {
        super();
        this.jumlahPintu = 0;
    }

    public Mobil(String merk, int tahunProduksi, int jumlahPintu) {
        super(merk, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

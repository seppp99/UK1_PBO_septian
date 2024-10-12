public class Motor extends Kendaraan {
    private boolean transmisi;

    public Motor() {
        super();
        this.transmisi = false;
    }

    public Motor(String merk, int tahunProduksi, boolean transmisi) {
        super(merk, tahunProduksi);
        this.transmisi = transmisi;
    }

    public boolean isMemilikiGigi() {
        return transmisi;
    }

    public void setMemilikiGigi(boolean transmisi) {
        this.transmisi = transmisi;
    }

    
    public void infoKendaraan() {
        super.infoKendaraan();
        System.out.println("transmisi manual : " + transmisi);
    }
}

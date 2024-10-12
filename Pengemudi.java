public class Pengemudi {
    private String nama;
    private int umur;

    public Pengemudi(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void infoPengemudi() {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }
}

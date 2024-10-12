public class Main {
    public static void main(String[] args) {
        Pengemudi pengemudi1 = new Pengemudi("Fadil", 20);
        Pengemudi pengemudi2 = new Pengemudi("Agus", 25);

        Mobil mobil1 = new Mobil("BMW", 2021, 2);
        Motor motor1 = new Motor("Ducati", 2020, true);
        Truk truk1 = new Truk("Volvo", 2015, 10);

        pengemudi1.infoPengemudi();
        mobil1.infoKendaraan();
        System.out.println();
        pengemudi2.infoPengemudi();
        motor1.infoKendaraan();
        System.out.println();
        pengemudi2.infoPengemudi();
        truk1.infoKendaraan();
    }
}

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Konsumsi> listKonsumsi = new ArrayList<>();
        Konsumsi<Makanan, Minuman> breakfast = new Konsumsi<>();
        Konsumsi<Makanan, Minuman> launch = new Konsumsi<>();

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Roti Tawar");

        Minuman susu = new Minuman();
        susu.setNamaHidangan("Susu Sapi");

        breakfast.setKonsumsi(roti,susu);
        listKonsumsi.add(breakfast);

        Makanan nasi = new Makanan();
        roti.setNamaHidangan("Nasi Putih");

        Minuman air = new Minuman();
        susu.setNamaHidangan("Air Putih");

        launch.setKonsumsi(nasi,air);
        listKonsumsi.add(launch);

        System.out.println(listKonsumsi);

    }

}

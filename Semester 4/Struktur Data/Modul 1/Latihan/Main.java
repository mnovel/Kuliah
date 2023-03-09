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

        Makanan roti = new Makanan();
        roti.setNamaHidangan("Nasi Putih");

        Minuman susu = new Minuman();
        susu.setNamaHidangan("Air Putih");

        breakfast.setKonsumsi(roti,susu);
        listKonsumsi.add(breakfast);

    }

}

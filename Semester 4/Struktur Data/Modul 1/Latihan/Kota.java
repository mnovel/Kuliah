public class Kota <E>{
    private E element;

    public kota(E kota){
        elemet =  kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args){
        Kota<Integer> jumlahKota = new Kota<integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota di Jawa Timur : " jumlahKota.getElement() + " Kota");
        System.out.println("Salah Satu Kota di Jawa Timur : Kota " + namaKota.getElement());
    }

}

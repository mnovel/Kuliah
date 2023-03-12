import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("--=[ MENGHITUNG LUAS SEGITIGA ]=-");
        System.out.print("Masukan nilai alas : ");
        int alas = in.nextInt();

        System.out.print("Masukan nilai alas : ");
        int tinggi = in.nextInt();

        System.out.println("Mau menampilkan hasil luas dalam bentuk ?");
        System.out.println("1. Hasil Integer");
        System.out.println("2. Hasil Double");
        System.out.print("Silahkan pilih 1 / 2 (Default 1) : ");
        int menu = in.nextInt();

        switch (menu) {
            case 1:
                Segitiga<Integer> luasInt = new Segitiga<>(alas, tinggi);
                System.out.println("Hasil luas segitiga adalah " + luasInt.getResultAsint());
                break;
            case 2:
                Segitiga<Double> luasDouble = new Segitiga<>((double) alas, (double) tinggi);
                System.out.println("Hasil luas segitiga adalah " + luasDouble.getResultAsDouble());
                break;
            default:
                luasInt = new Segitiga<>(alas, tinggi);
                System.out.println("Hasil luas segitiga adalah " + luasInt.getResultAsint());
        }
    }
}

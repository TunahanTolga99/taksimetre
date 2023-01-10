import java.util.Scanner;

public class taksi {
    public static void main(String[] args) {
        int km;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz : ");
        km = input.nextInt();
        double perKm = 2.20, total = 10;
        total += km * perKm;
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar : " + total);

    }
}

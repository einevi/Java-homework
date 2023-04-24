import java.util.Scanner;

public class Taksimetre {

    public static void main(String[] args) {
        int km;
        double perKm = 2.2, total, startprc = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi Giriniz (KM) : ");
        km = input.nextInt();

        total = (km * perKm);
        total += startprc;

        double b;
        if (total <= 20) b = 20;
        else b = total;

        System.out.println("Toplam Tutar : " + b);

    }
}

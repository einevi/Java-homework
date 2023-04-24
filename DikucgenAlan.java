import java.util.Scanner;

public class DikucgenAlan {

public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("A kenarı uzunluğunu giriniz : ");
        a = input.nextInt();
        System.out.print("B kenarı uzunluğunu giriniz : ");
        b = input.nextInt();
        double c = Math.sqrt((a * a) + (b * b));
        double u = (a + b + c) / 2;
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("C (Hipotenüs) uzunlugu = " + c);
        System.out.println("Üçgenin çevresi = " + u * 2);
        System.out.println("Üçgenin Alanı = " + alan);

    }
}

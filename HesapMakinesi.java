import java.util.Scanner;

public class HesapMakinesi {
    
    public static void main(String[] args) {

      int n1, n2, slct;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme ");
        System.out.println("Seçiminiz : ");
        slct = input.nextInt();


        switch (slct) {
            case 1 -> System.out.println("Toplam : " + (n1 + n2));
            case 2 -> System.out.println("Çıkartma : " + (n1 - n2));
            case 3 -> System.out.println("Çarpma : " + (n1 * n2));
            case 4 -> {
                if (n2 != 0) {
                    System.out.println("Bölme  : " + (n1 / n2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez !");
                }
            }
            default -> System.out.println("Yanlış seçim yaptınız. Tekrar deneyin");
        }

    }
}

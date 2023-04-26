import java.util.Scanner;

public class gecmeNotu {

    public static void main(String[] args) {
     int mat, fiz, tur, kim, muz, ort = 0, say = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fiz = input.nextInt();
        System.out.print("Türkçe notunu giriniz: ");
        tur = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kim = input.nextInt();
        System.out.print("Müzik notunuzu giriniz: ");
        muz = input.nextInt();

        if ((mat <= 100) && (mat >= 0)) {
            ort = ort + mat;
            say++;
        }
        if ((fiz <= 100) && (fiz >= 0)) {
            ort = ort + fiz;
            say++;
        }
        if ((tur <= 100) && (tur >= 0)) {
            ort = ort + tur;
            say++;
        }
        if ((kim <= 100) && (kim >= 0)) {
            ort = ort + kim;
            say++;
        }
        if ((muz <= 100) && (muz >= 0)) {
            ort = ort + muz;
            say++;
        }
        ort = ort / say;

        if (ort >= 55) {
            System.out.println("Sınıfı Geçtiniz");
        } else {
            System.out.println("Sınıfta Kaldınız");
        }
        System.out.print("Not Ortalamanız : " + ort);
    }
}

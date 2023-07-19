import java.util.Scanner;
public class 3ve4ebolum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        int total = 0, say = 0;
        System.out.println("Girilen Sayının 3 ve 4 e tam bölünme durumunu kontrol eder");
        System.out.print("Bir sayı giriniz : ");
        a = inp.nextInt();

        for (int i = 0; i<= a ; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                say ++;
                System.out.println("3'e ve 4'e Tam bölünebilen " + say+ ".Sayı: "  + i);
            }
         }
     System.out.println("Rapor: Toplam: " + ort + " Sayı tam bölünebilmektedir.\n" +
                        "Aritmetik Ortalaması: " + total/say+"\n" );
    }
}

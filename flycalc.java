import java.util.Scanner;
public class flycalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double mile, age, total;
        boolean isError = false;
        boolean type = true;

        System.out.print("Mesafeyi km türünden giriniz : ");
        mile = inp.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        age = inp.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        type = inp.nextBoolean();
        
            System.out.print("Hatalı Giriş Yaptınız.\nYolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        }

        if (age < 12){
            total = ((mile * 0.10) / 0.50);
            System.out.println("Toplam Tutar : " + total);
        }

        else if (12 >= age && age >= 24) {
            total = ((mile * 0.10) / 0.10);
            System.out.println("Toplam Tutar : " + total);
        }

        else if (age > 65) {
            total = ((mile * 0.10) / 0.30);
            System.out.println("Toplam Tutar : " + total);
        }

}}

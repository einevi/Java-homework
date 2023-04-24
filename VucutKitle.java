import java.util.Scanner;

public class VucutKitle {    
    
    public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);
            System.out.print("Lütfen Boyunuzu Giriniz (Metre): ");
            double boy= scan.nextDouble();
            System.out.print("Lütfen Kilonuzu Giriniz (Kg): ");
            double kilo= scan.nextDouble();
            double vucutkt= kilo/(boy*boy);
            System.out.println("Vücut Kitle İndeksiniz: "+vucutkt);

        }
    }

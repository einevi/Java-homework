import java.util.Scanner;                 
                                          
public class ManavKasa {                      
                                          
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        double armut= 2.14,elma= 3.67,domates = 1.11,muz=0.95,patlican= 5.00;

        System.out.print("Armut Kaç Kilo? : ");
        double armutKg= scan.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKg= scan.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatKg= scan.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKg= scan.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKg= scan.nextDouble();

        double armutFiyat= (armutKg*armut),elmaFiyat=(elmaKg*elma), domatFiyat=(domatKg*domates),muzFiyat=(muzKg*muz),patlicanFiyat=(patlicanKg*patlican);
        double toplam=armutFiyat+elmaFiyat+domatFiyat+muzFiyat+patlicanFiyat;

        System.out.println("Armut: "+armutFiyat+"TL"+"\nElma: "+elmaFiyat+"TL"+"\nDomates: "+domatFiyat+"TL"+"\nMuz: "+muzFiyat+"TL"+"\nPatlıcan: "+patlicanFiyat+"TL"+"\nToplam: "+toplam+"TL");

    }

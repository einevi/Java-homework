import java.util.Scanner;
public class Horoscopes {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int day, month;
        String hsign = "";
        boolean isError = false;

        System.out.print("Doğduğunuz ay : ");
        month = inp.nextInt();
        System.out.print("Doğduğunuz gün: ");
        day = inp.nextInt();

        if (month == 1 && (day>=1 && day<=31)){
            if (day>=1 && day<=21){
                hsign = ("Oğlak");
            }
            else {
                hsign = ("Kova");
            }
        }

        else if (month == 2 && (day>=1 && day<=29)){
            if (day>=1 && day<=19){
                hsign = ("Kova");
            }
            else {
                hsign = ("Balık");
            }
        }

        else if (month == 3 && (day>=1 && day<=31)){
            if (day>=1 && day<=20){
                hsign = ("Balık");
            }
            else {
                hsign = ("Koç");
            }
        }

        else if (month == 4 && (day>=1 && day<=30)){
            if (day>=1 && day<=21){
                hsign = ("Koç");
            }
            else {
                hsign = ("Boğa");
            }
        }

        else if (month == 5 && (day>=1 && day<=31)){
            if (day>=1 && day<=21){
                hsign = ("Boğa");
            }
            else{
                hsign = ("İkizler");
            }
        }

        else if (month == 6 && (day>=1 && day<=30)){
            if (day>=1 && day<=22){
                hsign = ("İkizler");
            }
            else {
                hsign = ("Yengeç");
            }
        }

        else if (month == 7 && (day>=1 && day<=31)){
            if (day>=1 && day<=22){
                hsign = ("Yengeç");
            }
            else{
                hsign = ("Aslan");
            }
        }

        else if (month == 8 && (day>=1 && day<=31)){
            if (day>=1 && day<=22){
                hsign = ("Aslan");
            }
            else{
                hsign = ("Başak");
            }
        }

        else if (month == 9 && (day>=1 && day<=30)){
            if (day>=1 && day<=22){
                hsign = ("Başak");
            }
            else {
                hsign = ("Terazi");
            }
        }

        else if (month == 10 && (day>=1 && day<=31)){
            if (day>=1 && day<=22){
                hsign = ("Terazi");
            }
            else{
                hsign = ("Akrep");
            }
        }

        else if (month == 11 && (day>=1 && day<=30)){
            if (day>=1 && day<=21){
                hsign = ("Akrep");
            }
            else {
                hsign = ("Yay");
            }
        }

        else if (month == 12 && (day>=1 && day<=31)){
            if (day>=1 && day<=21){
                hsign = ("Yay");
            }
            else{
                hsign= ("Oğlak");
            }
        }

        else {
            isError = true;
            System.out.println("Hatalı Giriş Yaptınız Tekrar Deneyin");
        }

        if (isError == false)
            System.out.println("Burcunuz " + hsign);
    }
}

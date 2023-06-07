import java.util.Scanner;
public class Sortnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("1. Sayıyı Giriniz : ");
        a = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        b = input.nextInt();
        System.out.print("3. Sayıyı Giriniz : ");
        c = input.nextInt();

        if ((a > b) && (a > c)){
            if (b > c){
                System.out.println("Sonuç : "+ a +" > "+ b + " > " + c);
            }else {
                System.out.println("Sonuç : "+ a + " > " + c + " > " + b);
            }
        } else if ((b > c) && (b > a)) {
            if (a > c){
                System.out.println("Sonuç : "+ b + " > " + a + " > " + c);
            }else{
                System.out.println("Sonuç : "+ b +" > " + c + " > " + a);
            }
        }else {
            if ((b > a)){
                System.out.println("Sonuç : "+ c + " > " + b + " > " + a);
            }else {
                System.out.println("Sonuç : "+ c + " > " + a + " > " + b);
            }
        }

    }
}

import java.util.Scanner;
public class evennumbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int total=0, x;
        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Bir sayı giriniz: ");
            x=input.nextInt();

            if(x%2==0 || x%4==0) {
                total+=x;
            }
        }while(x%2==0);
        System.out.println("çift sayılar ve 4'ün katı sayıların toplamı: "+total);

    }
}


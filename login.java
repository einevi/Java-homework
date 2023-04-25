import java.util.Scanner;
import java.lang.String;

public class login {
    public static void main(String[] args) {

  String password, options, new_password;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Şifrenizi Giriniz : ");
        password = input.next();

        if (password.equals("java123")) {
            System.out.print("Sisteme Giriş Yapıldı");
        } else {
            System.out.print("Yanlış şifre girdiniz , \nŞifrenizi değiştirmek istermisiniz? e/h");
            options = input.next();
            boolean check = options.equals("e");
            if (check) {
                while (check) {
                    System.out.print("Lütfen yeni şifrenizi giriniz : ");
                    new_password = input.next();
                    if (new_password.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.print("Yeni şifre kaydedildi");
                        check = false; }
                }
            } else
                System.out.print("Sistemden çıkıldı");


        }


    }
}

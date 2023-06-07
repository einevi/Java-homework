import java.util.Scanner;
    public class TempActivity {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
               int heat;

            System.out.print("Hava sıcaklığını giriniz: ");
            heat = inp.nextInt();

            if (heat < 5) {
                System.out.println("Kayak yapabilirsiniz");
            } else if (heat <= 25) {
                if (heat <= 15) {
                    System.out.println("Sinemaya gidebilirsiniz");
                }
                if (heat >= 15) {
                    System.out.println("Pikniğe gidebilirsiniz");
                }
            }
            else {
                System.out.println("Yüzmeye gidebilirsiniz");
            }
        }
    }

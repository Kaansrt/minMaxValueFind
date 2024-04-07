import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int i = 2;
        System.out.print("Kaç adet sayı girilecek : ");
        int n = inp.nextInt();
        int number,enBuyuk,enKucuk;
        System.out.print("1.sayı giriniz : ");
        number = inp.nextInt();
        enBuyuk = number;
        enKucuk = number;
        while (i <= n) {
            System.out.print(i+".sayiyi giriniz : ");
            number = inp.nextInt();
            if (number > enBuyuk) {
                enBuyuk = number;
            }
            if (number < enKucuk) {
                enKucuk = number;
            }
            if (enKucuk == enBuyuk) {
                System.out.println("Sayılar eşittir.");
            }
            i++;
        }
        System.out.println("En büyük sayi : " + enBuyuk);
        System.out.println("En kücük sayi : "+ enKucuk);

    }
}
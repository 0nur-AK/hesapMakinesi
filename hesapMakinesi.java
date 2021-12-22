
import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Sayıyı Giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("2. Sayıyı Giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println("Yapmak İstediğinizİşlemi Seçiniz");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        int secim = scan.nextInt();

        switch (secim){
            case 1 :
                System.out.println("Toplama işleminin sonucu : " + (sayi1+sayi2));
                break;
            case 2 :
                System.out.println("Çıkarma işleminin sonucu : " + (sayi1-sayi2) );
                break;
            case 3 :
                System.out.println("Çarpma işleminin sonucu : "+ (sayi1 * sayi2));
                break;
            case 4 :
                System.out.println("Bölme İşleminin sonucu : "+(sayi1/sayi2));
                break;

            default:
                System.out.println("HATALI GİRİŞ YAPTINIZ");
        }


        }

    }


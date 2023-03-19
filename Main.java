import javax.net.ssl.SSLContextSpi;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int yas, mesafe = 0, tip;
        double indirimY,indirimT, indirimF, biletF,sonF;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen Gideneceğiniz Yerin Km Mesafesini Giriniz: ");
        mesafe = scan.nextInt();

        System.out.print("Lütfen Yaşınızı Giriniz: ");
        yas = scan.nextInt();

        System.out.print("Lütfen Bilet Türünüzü Gidiş-Dönüş İse 1'e\nBiletiniz Sadece Gidiş İse 2'ye Basınız\nLütfen Bilet Türünüzü Giriniz ");
        tip = scan.nextInt();

        if (yas < 0 || mesafe < 0 || tip <= 0 || tip > 3) {
            System.out.println("Hatalı Veri Girişi Yaptınız :( ");
        }
        if(yas < 12){
            if(tip == 1) {
                biletF = (mesafe * 0.10);
                indirimT = (biletF * 0.20);
                indirimF = (biletF - indirimT);
                indirimY = (indirimF * 0.50);
                System.out.println("Bilet Fiyatınız : " + indirimY);
            }else{
                biletF = (mesafe * 0.10);
                indirimY = (biletF * 0.50);
                indirimF =(biletF - indirimY);
                System.out.println("Bilet Fiyatınız : " + indirimF);
            }
        }else if(yas >= 12 && yas < 24){
            if(tip == 1) {
                biletF = (mesafe * 0.10);
                indirimT = (biletF * 0.20);
                indirimF = (biletF - indirimT);
                indirimY = (indirimF * 0.10);
                sonF = (indirimF - indirimY);
                System.out.println("Bilet Fiyatınız : " + sonF);
            }else {
                biletF = (mesafe * 0.10);
                indirimY = (biletF * 0.10);
                indirimF =(biletF - indirimY);
                System.out.println("Bilet Fiyatınız : " + indirimF);
            }
        }else if(yas > 65){
            if(tip == 1){
                biletF = (mesafe * 0.10);
                indirimT = (biletF * 0.20);
                indirimF = (biletF - indirimT);
                indirimY = (indirimF * 0.30);
                sonF = (indirimF - indirimY);
                System.out.println("Bilet Fiyatınız : " + sonF);
            }else {
                biletF = (mesafe * 0.10);
                indirimY = (biletF * 0.30);
                indirimF =(biletF - indirimY);
                System.out.println("Bilet Fiyatınız : " + indirimF);
            }
        }else{
            System.out.println("Program Bitti.....");
        }

    }

}
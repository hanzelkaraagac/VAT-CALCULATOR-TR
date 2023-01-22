import java.text.DecimalFormat;
import java.util.Scanner;

public class Kdv_Hesaplama {

    public static void main(String[] args) {
        double tutar, kdvOrani = 0.18;
        DecimalFormat newTutar = new DecimalFormat("#.00");

        Scanner input = new Scanner(System.in);
        System.out.print("Tutarınızı giriniz : ");
        tutar = input.nextFloat();

        double kdvTutari = tutar * kdvOrani;

        double kdvliTutar = tutar + kdvTutari;


        System.out.println("------------------------------");
        System.out.println("KDV'siz Tutarınız : " + tutar + " ₺");
        System.out.println("KDV Oranınız: " + "% "+kdvOrani);
        System.out.println("Vergi Tutarınız: " + (newTutar.format(kdvTutari) + " ₺"));
        System.out.println("KDV Dahil Tutarı : " + (newTutar.format(kdvliTutar) + " ₺"));
        System.out.println("------------------------------");
        System.out.println("Genel Toplam : " + (newTutar.format(kdvliTutar) + " ₺"));




    }
}

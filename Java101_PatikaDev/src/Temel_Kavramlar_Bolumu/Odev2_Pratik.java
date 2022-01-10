package Temel_Kavramlar_Bolumu;

// TODO KDV Tutarı Hesaplayan Program

/*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/


import java.util.Scanner;

public class Odev2_Pratik {

    public static void main(String[] args) {

        float KDV;
        float money;
        float kdvAmount;
        float total;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Para miktarını giriniz:");

        while(true){
            money=scanner.nextFloat();
            if(money>0) break;
            else System.out.println("Lütfen negatif sayı girmeyiniz!");
        }

        if(money>0 && money<1000){
            KDV=0.18F;
        }else{
            KDV=0.08F;
        }

        kdvAmount=money*KDV;
        total=money+kdvAmount;

        System.out.println("Kdv'siz Fiyat="+money);
        System.out.println("Kdv'li Fiyat="+total);
        System.out.println("Kdv Tutarı="+kdvAmount);
    }

}

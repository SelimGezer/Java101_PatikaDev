package Kosullu_Ifadeler_Bolumu;

import java.util.Scanner;

//TODO Uçak bileti ücreti hesaplama programı

public class Odev7 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int distance;
        float distancePrice=0.10f;
        int age;
        int travelType;

        System.out.println("Sisteme hoşgeldiniz!");

        System.out.println("Mesafe giriniz:");
        distance=scanner.nextInt();
        if(distance<0){
            System.out.println("Lütfen pozitif değer giriniz! Programdan çıkılıyor!");
            System.exit(0);
        }

        System.out.println("Lütfen yaşınızı giriniz:");
        age= scanner.nextInt();
        if(age<0){
            System.out.println("Lütfen pozitif değer giriniz! Programdan çıkılıyor!");
            System.exit(0);
        }

        System.out.println("Lütfen yolculuk türünüzü seçiniz.Tek-Yon=1, Gidiş-Dönüş=2 olarak giriş yapınız:");
        travelType=scanner.nextInt();
        if(travelType<1 ||travelType>2){
            System.out.println("Lütfen 1 veya 2 giriniz! Programdan çıkılıyor!");
            System.exit(0);
        }

        float price=distancePrice * distance;
        float sale=0;
        if(age<12){
            sale = price * (float) (5/10.0);
        }else if(age>=12 && age<=24){
            sale = price * (float) (1/10.0);
        }else if(age>65){
            sale = price * (float) (3/10.0);
        }

        float priceWithSale= price - sale;

        float typeSale=0;
        if(travelType==2){
             typeSale = priceWithSale * (float) (2/10.0);
        }

        float totalPrice=(priceWithSale-typeSale);
        System.out.println(totalPrice);

    }
}

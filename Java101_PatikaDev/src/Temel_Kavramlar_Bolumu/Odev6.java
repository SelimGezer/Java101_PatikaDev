package Temel_Kavramlar_Bolumu;

/* TODO Manav Kasa Programı
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/

import java.util.Scanner;

public class Odev6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        float pearPrice=2.14f;
        float applePrice=3.67f;
        float tomatoPrice=1.11f;
        float bananaPrice=0.95f;
        float auberginePrice=5.0f;

        float pearAmount;
        float appleAmount;
        float tomatoAmount;
        float bananaAmount;
        float aubergineAmount;

        float total;

        System.out.println("Kaç kilo armut istiyorsunuz:");
        pearAmount=scanner.nextFloat();
        System.out.println("Kaç kilo elma istiyorsunuz:");
        appleAmount=scanner.nextFloat();
        System.out.println("Kaç kilo domates istiyorsunuz:");
        tomatoAmount=scanner.nextFloat();
        System.out.println("Kaç kilo muz istiyorsunuz:");
        bananaAmount=scanner.nextFloat();
        System.out.println("Kaç kilo patlıcan istiyorsunuz:");
        aubergineAmount=scanner.nextFloat();

        total  =pearPrice*pearAmount+
                applePrice*appleAmount+
                tomatoPrice*tomatoAmount+
                bananaPrice*bananaAmount+
                auberginePrice*aubergineAmount;

        System.out.println("Odenecek toplam tutar:"+total);

    }

}

package Temel_Kavramlar_Bolumu;

/* TODO Vücut Kitle İndeksi Hesaplayan Program
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
Formül
Kilo (kg) / Boy(m) * Boy(m)*/

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        float height;
        float weight;
        float index;

        System.out.println("Boy uzunluğunu m cinsinden giriniz:");
        height=scanner.nextFloat();
        System.out.println("Kilonuzu giriniz:");
        weight=scanner.nextFloat();

        index= weight/(height*height);

        System.out.println("Vucut kitle indeksiniz:"+index);
    }
}

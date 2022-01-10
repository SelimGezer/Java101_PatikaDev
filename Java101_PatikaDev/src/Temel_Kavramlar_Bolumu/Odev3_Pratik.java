package Temel_Kavramlar_Bolumu;

import java.util.Scanner;

//TODO Ödev Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
/*
Formül
Üçgenin çevresi= 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/

public class Odev3_Pratik {

    public static void main(String[] args) {

        int edge1,edge2,edge3;
        float area;

        Scanner scanner=new Scanner(System.in);

        System.out.println("İlk kenarın uzunluğunu giriniz:");
        edge1=scanner.nextInt();

        System.out.println("İkinci kenarın uzunluğunu giriniz:");
        edge2=scanner.nextInt();

        System.out.println("Ucuncu kenarın uzunluğunu giriniz:");
        edge3=scanner.nextInt();

        float s= (edge1+edge2+edge3)/2.0f;
        area= (float) Math.sqrt(s*(s-edge1)*(s-edge2)*(s-edge3));

        System.out.println("Çeşitkenar üçgenin alanı:"+area);
    }
}

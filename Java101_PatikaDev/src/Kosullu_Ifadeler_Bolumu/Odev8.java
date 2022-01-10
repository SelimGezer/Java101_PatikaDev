package Kosullu_Ifadeler_Bolumu;

import java.util.Scanner;

// TODO Çin zodyağı hesaplama

public class Odev8 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int year;
        System.out.println("Doğum yılınızı giriniz:");
        year= scanner.nextInt();

        String[] dizi=new String[12];
        dizi[0]="Maymun";
        dizi[1]="Horoz";
        dizi[2]="Köpek";
        dizi[3]="Domuz";
        dizi[4]="Fare";
        dizi[5]="Öküz";
        dizi[6]="Kaplan";
        dizi[7]="Tavşan";
        dizi[8]="Ejderha";
        dizi[9]="Yılan";
        dizi[10]="At";
        dizi[11]="Koyun";

        System.out.println("Çin zodyağı burcunuz:"+dizi[year%12]);
    }
}

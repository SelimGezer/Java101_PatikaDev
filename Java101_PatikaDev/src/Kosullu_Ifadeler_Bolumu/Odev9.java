package Kosullu_Ifadeler_Bolumu;

import java.util.Scanner;

// TODO Artık Yıl Hesaplama
public class Odev9 {
    public static void main(String[] args) {
      /*  Scanner scanner=new Scanner(System.in);
        int year;
        System.out.println("Yıl giriniz:");
        year=scanner.nextInt();

        if(year%4==0) {
            if (year % 100 == 0 ) {
                if(year % 400 == 0){
                    System.out.println("Artık yıldır!");
                }else{
                    System.out.println("Artık yıl değildir!");
                }
            }else{
                System.out.println("Artık yıldır!");
            }
        }else{
            System.out.println("Artık yıl değildir!");
        }*/

        int sum = 0;
        for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {
            sum += i;
        }
        System.out.println(sum);
    }
}

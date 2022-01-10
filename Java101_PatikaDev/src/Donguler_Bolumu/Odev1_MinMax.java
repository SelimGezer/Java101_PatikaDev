package Donguler_Bolumu;


//TODO Girilen Sayılardan Min ve Max Değerleri Bulma

import java.util.Scanner;

public class Odev1_MinMax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numberCount;
        System.out.println("Kaç tane sayı gireceksiniz?");
        numberCount= scanner.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        int gecici=numberCount;
        while(numberCount>0){

            System.out.println(1+gecici-numberCount+".Sayıyı giriniz:");
            int temp=scanner.nextInt();

            if(max<temp){
                max=temp;
            }

            if(min>temp){
                min=temp;
            }

            numberCount--;
        }

        System.out.println("Max deger:"+max);
        System.out.println("Min deger:"+min);

    }
}

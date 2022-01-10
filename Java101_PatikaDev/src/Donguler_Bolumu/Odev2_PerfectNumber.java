package Donguler_Bolumu;

import java.util.Scanner;

// TODO Mükemmel sayı kontrolu
public class Odev2_PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int number;
        System.out.println("Sayi giriniz:");
        number=scanner.nextInt();

        int sum=0;
        for (int i = 1; i <number ; i++) {
            if(number%i==0) sum+=i;
        }
        if(number==sum){
            System.out.println(number +" mükemmel sayıdır.");
        }else{
            System.out.println("Girilen sayı mükemmel sayı değildir.");
        }

    }
}

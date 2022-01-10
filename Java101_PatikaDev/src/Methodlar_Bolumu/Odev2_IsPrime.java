package Methodlar_Bolumu;

import java.util.Scanner;

//TODO Ödev - Asal Sayı Bulan Program
public class Odev2_IsPrime {

    public static void isPrime(int number,int divide){
        if(number%divide==0 && number!=divide) {
            System.out.println(number+" sayısı Asal Değildir!");
            return;
        }
        if(number==divide) {
            System.out.println(number+" sayısı Asaldır.#");
            return;
        }
        divide++;
        isPrime(number,divide);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        for(int i=2;i<10;i++){
            isPrime(i,2);
        }
    }
}

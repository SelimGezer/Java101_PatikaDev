package Donguler_Bolumu;

import java.util.Scanner;

//TODO Ödev - Fibonacci Serisi
public class Odev5_FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int range;
        System.out.println("İlk kaç sıralamayı istiyorsunuz?");
        range=scanner.nextInt();

        int count=0;
        int firstItem=0;
        int secondItem=1;
        boolean flag=true;

        while(count<range){
           if(flag){
               secondItem = firstItem+secondItem;
               System.out.println(secondItem);
           }else{
               firstItem=firstItem+secondItem;
               System.out.println(firstItem);
           }
           flag=!flag;
           count++;
        }
    }
}

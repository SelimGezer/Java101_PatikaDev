package Diziler_Bolumu;

import java.util.Arrays;
import java.util.Scanner;


//TODO Ödev - Dizideki Elemanları Sıralama

public class Odev1_ArraySort {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n;
        System.out.println("Dizinin boyutunu giriniz:");
        n= scanner.nextInt();
        int[] array=new int[n];
        int i=0;
        while(n>0){
            System.out.println((i+1)+".Elemanı giriniz:");
            array[i]=scanner.nextInt();
            n--;
            i++;
        }

        for (int j=0;j<array.length;j++){
            for (int k=0;k<array.length-1;k++){
                if(array[k]>array[k+1]){
                    int min=array[k+1];
                    array[k+1]=array[k];
                    array[k]=min;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

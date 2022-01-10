package Donguler_Bolumu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
/*
        int n=scanner.nextInt();
        int[] dizi=new int[n];// {1,-2,4,-5,1};

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=scanner.nextInt();
        }

        List<Integer> toplam=new ArrayList<>();

        int toplamS=0;
        for (int i = 0; i < dizi.length; i++) {
            toplamS=dizi[i];
            if(toplamS<0){
                toplam.add(toplamS);
            }
            for (int j = i+1; j < dizi.length; j++) {
                toplamS+=dizi[j];
                if(toplamS<0){
                    toplam.add(toplamS);
                }
            }
        }

        System.out.println(toplam.size());*/
        int sayi=(int)(Math.random()*100.f);
        System.out.println(sayi);
        scanner.nextInt();
    }
}

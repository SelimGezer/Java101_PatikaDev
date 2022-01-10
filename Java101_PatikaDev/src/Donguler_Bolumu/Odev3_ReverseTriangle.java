package Donguler_Bolumu;

import java.util.Scanner;

// TODO Ödev - Ters Üçgen Yapımı
public class Odev3_ReverseTriangle {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int size=0;
        System.out.println("Basamak sayısı giriniz:");
        size=scanner.nextInt();

        for (int i = 1; i <= size ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (size*2+1)-(i*2) ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

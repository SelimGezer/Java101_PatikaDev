package Donguler_Bolumu;

import java.util.Scanner;
//TODO Elmas oluşturan program
public class DiamondGenerator_Pratik {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int baseStartCount;
        System.out.println("Kaç tabanlı bir yıldız oluşturmak istiyorsunuz:");
        baseStartCount= scanner.nextInt();

        String expression="";
        for (int i = 0; i <= baseStartCount ; i+=2) {

            for (int j = 0; j <baseStartCount/2-(i/2);j++) {
                expression += " ";
            }

            for (int k = 0; k < i+1; k++) {
                 expression += "*";
            }

            System.out.println(expression);
            expression = "";
        }
        for (int i = baseStartCount-2; i > -1 ; i-=2) {

            for (int j = 0; j <baseStartCount/2-(i/2);j++) {
                expression += " ";
            }

            for (int k = 0; k < i; k++) {
                expression += "*";
            }

            System.out.println(expression);
            expression = "";
        }
    }
}

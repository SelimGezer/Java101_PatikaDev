package Methodlar_Bolumu;

import java.util.Scanner;

//todo Ödev - Desene Göre Metot Oluşturma
public class Odev3_Pattern {

    static void pattern(int number){

        if(number<=0){
            System.out.print(number+" ");
            return;
        }

        System.out.print(number+" ");
        int kopya=number-5;
        pattern(kopya);
        System.out.print(number+" ");

    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int number;
        System.out.println("Deseni başlatacak Sayiyı giriniz:");
        number=scanner.nextInt();

        pattern(number);
    }

}

package Methodlar_Bolumu;

import java.util.Scanner;

// TODO Recursive Metotlar ile Üslü Sayı Hesaplama

public class Odev1_PowerCalculate {

    public static void power(int base,int power,int result){

        if(power==0) {
            System.out.println("Sonuç:"+result);
            return;}

        result*=base;
        power--;
        power(base,power,result);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int base;
        int power;

        System.out.println("Tabanı giriniz:");
        base=scanner.nextInt();

        System.out.println("Üs ü giriniz:");
        power=scanner.nextInt();

        power(base,power,1);
    }

}

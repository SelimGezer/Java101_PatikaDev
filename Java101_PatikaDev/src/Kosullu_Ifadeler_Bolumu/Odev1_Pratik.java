package Kosullu_Ifadeler_Bolumu;

import java.util.Scanner;

//Todo Switch-Case yapısı ile çalışan hesap makinesi yazınız

public class Odev1_Pratik {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n1;
        int n2;
        float result=0;
        int select;

        System.out.println("İlk sayıyı giriniz:");
        n1=scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        n2=scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz:");
        select=scanner.nextInt();

        switch (select){
            case 1:{
                result=n1+n2;
                break;
            }
            case 2:{
                result=n1-n2;
                break;
            }
            case 3:{
                result=n1*n2;
                break;
            }
            case 4:{
                result=(float) n1/n2;
                break;
            }
            default:{
                System.out.println("Geçersiz bir işlem seçtiniz!");
                break;
            }
        }

        System.out.println("İşlem sonucu:"+result);
    }
}

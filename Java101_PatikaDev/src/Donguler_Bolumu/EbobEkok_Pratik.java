package Donguler_Bolumu;

import java.util.Scanner;

public class EbobEkok_Pratik {

    static int ebob(int a, int b)
    {
        int ebob=1;
        int i=1;
        while (true){
            if (a%i ==0 && b%i==0){
                ebob=i;
            }
            if(i==a || i== b){
                break;
            }
            i++;
        }
        return ebob;
    }
    static int ekok(int a,int b,int ebob){
        return (a*b)/ebob;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1,n2;
        System.out.println("İlk sayıyı giriniz:");
        n1=scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz:");
        n2=scanner.nextInt();

        int ebob=ebob(n1,n2);
        int ekok=ekok(n1,n2,ebob);
        System.out.println("Ebob:"+ebob);
        System.out.println("Ekok:"+ekok);

    }
}

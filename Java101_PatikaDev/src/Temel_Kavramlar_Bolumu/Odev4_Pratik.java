package Temel_Kavramlar_Bolumu;


// TODO Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
/*Ödev

𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360*/

import java.util.Scanner;

public class Odev4_Pratik {

    public static void main(String[] args) {

        int r;
        float alpha;
        float area;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Yarıçap giriniz:");
        r=scanner.nextInt();

        System.out.println("Alfa açı değerini giriniz:");
        alpha=scanner.nextFloat();

       area= (float) (Math.PI * r * r * (alpha/360));

        System.out.println("Daire diliminin alanı:"+area);
    }


}

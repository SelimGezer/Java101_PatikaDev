package Temel_Kavramlar_Bolumu;

import java.util.Scanner;


/* TODO Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
Ödev
Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
Not : If ve Else kullanılmayacak...*/
public class Odev1_Pratik {

    public static void main(String []args){
        int mat, fizik, turkce, kimya, muzik;
        double average;

        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        mat = scan.nextInt();
        if (mat<0 || mat>100){
            mat = 0;
        }

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = scan.nextInt();
        if (fizik<0 || fizik>100){
            fizik = 0;
        }

        System.out.println("Turkce notunuzu giriniz: ");
        turkce = scan.nextInt();
        if (turkce<0 || turkce>100){
            turkce = 0;
        }

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = scan.nextInt();
        if (kimya<0 || kimya>100){
            kimya = 0;
        }

        System.out.println("Muzik notunuzu giriniz: ");
        muzik = scan.nextInt();
        if (muzik<0 || muzik>100){
            muzik = 0;
        }

        average = (mat + fizik + turkce + kimya + muzik) / 5.0;

        System.out.println("\nOrt: "+ average +" - "+ (average > 60 ? "Sinifi Gectiniz" : "Kaldiniz!") );
    }
}
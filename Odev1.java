import java.util.Scanner;

public class Odev1{

     public static void main(String []args){
        int mat, fizik, turkce, kimya, music;
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
        music = scan.nextInt();
        if (music<0 || music>100){
            music = 0;
        }

        average = (mat + fizik + turkce + kimya + music) / 5.0;

		System.out.println("\n"+ average +"-"+ (average > 60 ? "Sinifi Gectiniz" : "Kaldiniz!") );
     }
}
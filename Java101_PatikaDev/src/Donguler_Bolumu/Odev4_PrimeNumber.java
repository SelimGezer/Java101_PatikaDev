package Donguler_Bolumu;


// TODO Ödev - 1-100 Arasındaki Asal Sayıları Bulan Program
public class Odev4_PrimeNumber {
    public static void main(String[] args) {

        boolean flag=false;
        for (int i = 2; i < 100 ; i++) {
            for (int j = 2; j < i ; j++) {
                if(i%j==0){
                    flag=true;
                }
            }
            if(!flag || i==2){
                System.out.println(i);
            }
            flag=false;
        }
    }
}

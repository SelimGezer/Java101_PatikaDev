package Diziler_Bolumu;

// TODO Ödev - Dizideki Elemanların Frekansı

import java.util.Arrays;

public class Odev2_Frequency {
    public static void main(String[] args) {
        int[] array=new int[]{1,0,5,6,89,5,47,6,2,89};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int start=-1;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]==array[i+1]){
               continue;
            }else{
                System.out.println(array[i]+" Elemanın tekrar sayısı:"+((i)-start));
                start=i;
            }
        }
        System.out.println(array[array.length-1]+" Elemanın tekrar sayısı:"+((array.length-1)-start));
    }
}

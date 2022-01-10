package Donguler_Bolumu;

import javax.xml.stream.FactoryConfigurationError;
import java.util.Arrays;
import java.util.HashSet;

public class Test
{
    /*public static boolean canWin(int leap, int[] game) {
        for(int i=0;i<game.length-1;i++){
            if(game[i+1]==0){
               continue;
            }
            int oneCount=0;
            int ik=i+1;
            while(ik<game.length && game[ik]==1){
                oneCount++;
                ik++;
            }
            if(ik>game.length && ik-i<leap) return true;

            if(oneCount<leap){
                i=ik-1;
            }else{
                return false;
            }
        }
        return true;
    }*/


  /*  public static boolean canWin(int leap, int[] game,int indis){

        if(indis<0) return false;
        // if(game[indis]==0 ) return true;
        if(game[indis]==1 ) return false;

        boolean sonuc=false,sonuc1= false,sonuc2=false;
        if(game[indis]==0){
             sonuc  = canWin(leap, game, indis-1);
             sonuc1 = canWin(leap, game, indis+1);
             sonuc2 = canWin(leap, game, indis+leap);

        return sonuc || sonuc1 || sonuc2;
        }


return false;
    }*/
    static HashSet<Integer> set=new HashSet<>();
    public static boolean canWin(int leap, int[] game) {
        set.clear();
        return solve(game,0,leap);
    }
    static boolean solve(int []g,int i,int leap){
        if(set.contains(i)==false){
            if(i>=g.length)return true;
            if(i<0 || g[i]==1 )return false;
            set.add(i);
            return solve(g,i+1,leap) || solve(g,i+leap,leap) || solve(g,i-1,leap) ;
        }else
            return false;

    }

    public static void main(String[] args)
    {

    //    System.out.println("0 1 0 1 0 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 1 0 0 1 1 1 1 1 1 1 1 0 1 1 1 0 1 1 1 1 1 0 1 1 0 1 1 1 0 1 1 1 1 1 1 1 1 0 1 0 0 0 0 1 1 0 1 0 0 1 1 0".replace(' ',','));
    //    System.out.println(  canWin(15,new int[]{0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,1,0,1,1,1,0,1,1,1,1,1,1,1,1,0,1,0,0,0,0,1,1,0,1,0,0,1,1,0}));
       System.out.println(canWin(3,new int[]{0, 0,0,0,0}));
      /* System.out.println(canWin(5,new int[]{-1,0,0,1,1,1},0));
       System.out.println(canWin(3,new int[]{-1,0,1,1,1,0},0));
        System.out.println(canWin(1,new int[]{-1, 1 ,0},0));*/
    }
}
package Bitirme_Bolumu;

import javax.swing.text.ViewFactory;
import java.util.Arrays;
import java.util.List;

public class MineSweeper {

    int row,col;
    String[][] gameMatrix;
    int mineCount;
    int selectCounter=0;

    public MineSweeper(int row, int col) {
        this.row=row;
        this.col=col;

        gameMatrix=new String[row][col];
        mineCount=(row*col)/4;

        createMineMap();
    }
    public void createMineMap(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                gameMatrix[i][j] ="-";
            }
        }
    }

    public void showGame(){
        String colTxt="";
        for (int i = 0; i < col; i++) {
            colTxt+=i+" ";
        }
        System.out.println("    "+colTxt);
        for (int i = 0; i < row; i++) {
            System.out.print(i+" | ");
            for (int j = 0; j < col; j++) {
                System.out.print(gameMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    String mineTxt="";
    public void mineCreate(){
        for (int i = 0; i < mineCount; i++) {
            int x=(int)(Math.random()*row);
            int y=(int)(Math.random()*col);
            String newMinePos=x+","+y+"/";
            if (haveMine(x,y)){
                i--;
            }else{
                mineTxt+=newMinePos;
            }
        }
    }

    public boolean haveMine(int x,int y){
        String newMine=x+","+y+"/";
        if(mineTxt.contains(newMine)){
            return true;
        }else{
            return false;
        }
    }

    public void minePosShow(){
        System.out.println("Mayın Kordinatları:");
        for (int i = 0; i < mineTxt.length(); i+=4) {
            String newMine=  mineTxt.substring(i,i+3);
            System.out.println(newMine);
        }
    }

    public void addMine(){
        for (int i = 0; i < mineTxt.length(); i+=4) {
            String minePos = mineTxt.substring(i,i+3);
            int x=minePos.charAt(0)-'0';
            int y=minePos.charAt(2)-'0';
            gameMatrix[x][y]="*";
        }
    }

    public void isMine(int userInputRow,int userInputCol){
        int mineCounter=0;

        if(haveMine(userInputRow,userInputCol)){
            gameOver();
            return;
        }else {

            if (userInputCol - 1 >= 0) {//sol komşu
                if(haveMine(userInputRow,userInputCol-1)){
                    mineCounter++;
                }
            }
            if (userInputCol + 1 < col) {//sağ komşu
                if(haveMine(userInputRow,userInputCol+1)){
                    mineCounter++;
                }
            }
            if (userInputRow - 1 >= 0) {//yukarı komşu
                if(haveMine(userInputRow-1,userInputCol)){
                    mineCounter++;
                }
            }
            if (userInputRow + 1 < row) {//aşağı komşu
                if(haveMine(userInputRow+1,userInputCol)){
                    mineCounter++;
                }
            }

            gameMatrix[userInputRow][userInputCol]=""+mineCounter;
        }
    }

    public void winGame(){
        System.out.println("\nOyunu kazandınız! TEBRİKLER");

    }
    public void gameOver(){
        System.out.println("\n Mayına bastınız! Malesef oyunu kaybettiniz!");
        System.exit(0);
    }

}

package Bitirme_Bolumu;

import java.util.Scanner;

public class GameApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int userInputRow=2;
        int userInputCol=2;
        MineSweeper mineSweeper=new MineSweeper(userInputRow,userInputCol);
        System.out.println("MAYIN TARLASINA HOŞGELDİNİZ!\nOyun tıklanan konumun sol-sağ-yukarı-aşağı olmak üzere 4 tarafındaki mayınları taramaktadır!\n");
        mineSweeper.mineCreate(); //mayınları oluştur (haritaya eklemiyor)
      //  mineSweeper.minePosShow(); //mayın kordinatlarını görmek için
        mineSweeper.addMine(); //mayın ekle (oluşturulan mayınları haritaya ekle)
        System.out.println("Mayınlı arazi haritası!");
        mineSweeper.showGame(); //oyunu görüntüle
        System.out.println("-------------------------");

        System.out.println("\nOYUN BAŞLIYOR!");
        mineSweeper.createMineMap(); //boş tarla oluştur
        mineSweeper.showGame();

        String selectedPos="";
        while(true){
            if(mineSweeper.selectCounter== (mineSweeper.row* mineSweeper.col) - mineSweeper.mineCount){
                mineSweeper.winGame();
                break;
            }
            int xPos;
            int yPos;
            while(true){
                System.out.println("\n-->X pos giriniz:");
                xPos=scanner.nextInt();
                if(xPos>=0 && xPos<userInputRow){
                    break;
                }else{
                    System.out.println("\nHATALI DEĞER GİRDİNİZ!\n");
                }
            }
            while(true){
                System.out.println("-->Y pos giriniz:");
                yPos=scanner.nextInt();
                if(yPos>=0 && yPos<userInputCol){
                    break;
                }else{
                    System.out.println("\nHATALI DEĞER GİRDİNİZ!\n");
                }
            }

            String newSelectedPos=xPos+","+yPos+"/";
            if(!selectedPos.contains(newSelectedPos)){
                selectedPos+=newSelectedPos;
                mineSweeper.selectCounter++;
                mineSweeper.isMine(xPos,yPos);
                mineSweeper.showGame();
            }else{
                System.out.println("\nDaha önce seçilmiş bir alana tıkladınız!");
            }
        }
    }
}

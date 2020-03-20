package pl.tablice;

import java.util.Arrays;
import java.util.Scanner;

public class SmallSquare {


    public int [][] smallSquare = new int[3][3];
    public SmallSquare(){
        creatingSS();
        getSquare();
    }

    //public void setSmallSquare(int[][] smallSquare) {
    //    this.smallSquare = smallSquare;
    //}

    public void getSquare(){
        int [][] x = smallSquare;
        System.out.println("__ __ __ \n" +
                "|" + x[0][0]+"| "+ x[0][1]+"| "+ x[0][2]+"| "+ "\n" +
                "__ __ __ \n" +
                "|" + x[1][0]+"| "+ x[1][1]+"| "+ x[1][2]+"| "+ "\n" +
                "__ __ __ \n" +
                "|" + x[2][0]+"| "+ x[2][1]+"| "+ x[2][2]+"| "+ "\n" +
                "-- -- --");
    }
    public void creatingSS(){
        for(int i = 0; i < 3 ; i++) {
            for (int j = 0; j < 3; j++) {
                int unit = checker();
                this.smallSquare[i][j] = unit;
            }
        }
    }

    private int checker(){
        int unit = (int)(Math.random()*9);
        for (int[] element : this.smallSquare) {
            for(int i : element)
            {

                boolean x=true;
                //getSquare();
                while(x == true){
                    if (i == unit) {
                        x = true;
                        System.out.println("Niepoprawna liczba : " + unit);
                        unit = (int)(Math.random()*9);
                        System.out.println("Probuje liczbe :"+ unit);
                    }
                    else{
                        x = false;
                    }
                }
            }
        }
        return unit;
    }
}

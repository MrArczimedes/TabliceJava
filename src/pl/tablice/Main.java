package pl.tablice;

import java.util.*;

import static java.lang.Integer.sum;

public class Main {

   /* public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] tableOne = new int[3];
        tableOne[0] = myScanner.nextInt();
        tableOne[1] = myScanner.nextInt();
        tableOne[2] = myScanner.nextInt();
        OperationalTables op= new OperationalTables();
        int x= op.operationOne(tableOne);
        int y = op.operationTwo(tableOne);
        System.out.println(y);
    }*/
   public static void main(String[] args) {

       SmallSquare sdkx = new SmallSquare();
       Map<String, SmallSquare> myMap = new TreeMap<String, SmallSquare>();
       for (int i = 0; i<9; i++){
       String name = "sdk";
       name = name + i;
       myMap.put(name, new SmallSquare());
           System.out.println(myMap.values());
       }




    }
}
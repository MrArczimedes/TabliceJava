package pl.tablice;

import static java.lang.Integer.sum;

public class OperationalTables {
    public int operationOne (int[] table) {
        return table[0] + table[1];
    }
    public int operationTwo (int[] table) {
        int theBiggest = table[0];
        for(int i = 0; i < table.length; i++)
        {
            if( table[i]>theBiggest) {
                theBiggest = table[i];
            }
        }
        return theBiggest;
    }
}

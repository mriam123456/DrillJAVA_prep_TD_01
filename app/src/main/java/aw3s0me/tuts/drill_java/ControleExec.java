package aw3s0me.tuts.drill_java;

/**
 * Created by RIAMM on 14/08/2017.
 */

public class ControleExec {

    public static int[] fibbonaci_depart_0(int pos)
    {
        int[] fibs = new int[pos+1];

        int current = 0;

        for (int i=0; i<=pos; i++)
        {
            fibs[i] = current;

            if(i!=0)
                current += fibs[i-1];
            else
                current++;

        }

        return fibs;
    }

    public static int[] fillWithOddOnly(int pos)
    {
        int[] odds = new int[pos+1];

        int j =1;
        for(int i =0; i <= pos; i++)
        {
            if(j%2==1)
                odds[i] = j;
            else
                i--;
            j++;
        }

        return odds;
    }
}

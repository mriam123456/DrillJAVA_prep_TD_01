package aw3s0me.tuts.drill_java;

/**
 * Created by RIAMM on 14/08/2017.
 */

public class ControleExec {

    /*

        Objectif : Implémentez la fonction fibbonaci_depart_0 , qui permet de retourner la suite de fibbonaci jusqu'a l'élément fourni en argument (premier élément de la suite == 0)

     */
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

    /*
        Objectif : Implémenter la fonction fillWithOddOnly qui rempli un tableau de longueur pos+1 avec la suite des chiffres impairs (commencant par 1)
     */

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

package aw3s0me.tuts.drill_java;
import java.math.*;

/**
 * Created by RIAMM on 11/08/2017.
 */

public class types_donnees {

    /*
        Objectif:

        Retourner un entier
     */
    public static int entiers(float in)
    {
        return (int)in;
    }

    /*
    Objectif:

    Retourner un flottant
 */
    public static float flottant(int in)
    {
        return (float)in;
    }

        /*
        Objectif:

        Retourner un entier en résultat de l'opération d'addition entre un entier et un flottant
     */

    public static int addition_entier_flottant(int entier,float flottant)
    {
        return (int)(entier+flottant);
    }

        /*
        Objectif:

        Retourner un entier long , en résultat de l'opération entier1 puissance entier2
     */

    public static long entierLong(int entier1 , int entier2)
    {
        return (long)Math.pow((double)entier1 , (double)entier2);
    }


}

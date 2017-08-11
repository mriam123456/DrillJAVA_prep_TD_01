package aw3s0me.tuts.drill_java;
import java.math.*;

/**
 * Created by RIAMM on 11/08/2017.
 */

public class types_donnees {

    public static int entiers(float in)
    {
        return (int)in;
    }

    public static float flottant(int in)
    {
        return (float)in;
    }

    public static int addition_entier_flottant(int entier,float flottant)
    {
        return (int)(entier+flottant);
    }

    public static long entierLong(int entier1 , int entier2)
    {
        return (long)Math.pow((double)entier1 , (double)entier2);
    }


}

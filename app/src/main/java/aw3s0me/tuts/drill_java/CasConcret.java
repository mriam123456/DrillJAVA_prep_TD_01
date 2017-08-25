package aw3s0me.tuts.drill_java;

/**
 * Created by RIAMM on 25/08/2017.
 */

public class CasConcret {

    public static int annees_avant_plafond(float interet,int mise_de_depart, int plafond)
    {

        float interet_normalise = interet / 100;
        int i =0;

        float montant_courant = mise_de_depart;

        while(montant_courant < plafond)
        {
            //System.out.println("Avant calcul : " + montant_courant);
            i++;
            System.out.println("Avant calcul année "+i+" : " + montant_courant);
            montant_courant += montant_courant * interet_normalise;
            System.out.println("Après calcul année "+i+" : " + montant_courant);

        }

        return i;
    }
}

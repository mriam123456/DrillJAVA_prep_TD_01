package aw3s0me.tuts.drill_java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by RIAMM on 25/08/2017.
 */

public class CasConcret {


    /*
    Objectif:

            - Implémentez la fonction années_avant_plafond , qui permet de calculer a partir d'un intérêt , d'une mise de départ et d'un plafond
                  le nombre d'année nécessaire pour atteindre le plafond d'un placement obligataire
    */
    public static int annees_avant_plafond(float interet,int mise_de_depart, int plafond)
    {

        float interet_normalise = interet / 100;
        int i =0;

        float montant_courant = mise_de_depart;

        while(montant_courant < plafond)
        {
            i++;
            System.out.println("Avant calcul année "+i+" : " + montant_courant);
            montant_courant += montant_courant * interet_normalise;
            System.out.println("Après calcul année "+i+" : " + montant_courant);

        }

        return i;
    }


    /*
        Objectifs :

            Déterminez la valeur médianne d'un tableau de valeurs entières arbitraires
            Rappel , si la taille du tableau est pair la valeur médianne est obtenue par la moyenne des 2 valeur les plus médiannes
     */

    public static float calcul_valeur_medianne(int[] valeurs)
    {
        Arrays.sort(valeurs);

        if(valeurs.length % 2 != 0)
        {
            return valeurs[(valeurs.length-1)/2];
        }
        else
        {
            return (float)(valeurs[(valeurs.length/2)-1] + valeurs[(valeurs.length/2)])/2;
        }

    }


    /*
    Objectif:

    étant donné un tableau de caractères , renvoyez un HashMap<Character,Float> contenant la probabilité d'occurence de chaque caractère
 */
    public static HashMap<Character,Float> distribution_probabilite(char[] caracteres)
    {

        HashMap<Character,Integer> dist = new HashMap<>();

        for(char c : caracteres)
        {
            if(dist.containsKey(c))
            {
                dist.put(c,dist.get(c)+1);
            }
            else
            {
                dist.put(c,1);
            }
        }

        HashMap<Character,Float> probDist = new HashMap<>();

        for(Map.Entry<Character,Integer> entry: dist.entrySet())
        {
            probDist.put(entry.getKey(),(float)entry.getValue()/caracteres.length);
        }

        return probDist;
    }
}

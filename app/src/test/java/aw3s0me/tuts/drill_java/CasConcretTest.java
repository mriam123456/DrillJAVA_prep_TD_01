package aw3s0me.tuts.drill_java;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.isA;
/**
 * Created by RIAMM on 25/08/2017.
 */

public class CasConcretTest {

    @Test
    public void test_annees_avant_plafond()
    {
        int annees1 = CasConcret.annees_avant_plafond(100,100,200);
        assertEquals(1,annees1);

        int annees2 = CasConcret.annees_avant_plafond(25,100,200);
        assertEquals(4,annees2);

        int annees3 = CasConcret.annees_avant_plafond(6,22750,62700);
        assertEquals(18,annees3);

        System.out.print(annees3);
    }

    @Test
    public void test_calcul_valeur_medianne()
    {
        int[] tab1 = {1,2,3,4,5};
        assertEquals(3,CasConcret.calcul_valeur_medianne(tab1),0);

        int[] tab2 = {1,2,3,4,5,6};
        assertEquals(3.5f,CasConcret.calcul_valeur_medianne(tab2),0);

        int[] tab3 = {4,6,3,1,2,5};
        assertEquals(3.5f,CasConcret.calcul_valeur_medianne(tab3),0);

        int[] tab4 = {278,9861,6945,1,8613};
        assertEquals(6945f,CasConcret.calcul_valeur_medianne(tab4),0);

        int[] tab5 = {278,9861,6945,1,8613,94856};
        assertEquals(7779f,CasConcret.calcul_valeur_medianne(tab5),0);
    }

    @Test
    public void test_distribution_probabilite()
    {
        char[] caracs = {'A','B','C','D','E','Z','A','A','D','E','Z','B','B','E','A','B'};

        assertThat(CasConcret.distribution_probabilite(caracs) , isA(HashMap.class));

        HashMap<Character,Float> probs =  CasConcret.distribution_probabilite(caracs);



        assertEquals(0.25f,probs.get('A'),0);
        assertEquals(0.25f,probs.get('B'),0);
        assertEquals(0.0625f,probs.get('C'),0);
        assertEquals(0.125f,probs.get('D'),0);
        assertEquals(0.1875f,probs.get('E'),0);
        assertEquals(0.125f,probs.get('Z'),0);
    }

}

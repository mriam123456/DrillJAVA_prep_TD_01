package aw3s0me.tuts.drill_java;

import org.junit.Test;

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

}

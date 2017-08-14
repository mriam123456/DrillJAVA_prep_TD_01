package aw3s0me.tuts.drill_java;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.isA;
/**
 * Created by RIAMM on 14/08/2017.
 */

public class ControlExecUnitTest {

    @Test
    public void testFibo()
    {
        //System.out.print(ControleExec.fibbonaci_depart_0(3).toString());
        int[] test = ControleExec.fibbonaci_depart_0(45);

        assertEquals("La valeur à la position 0 n'est pas celle attendue",0,test[0]);
        assertEquals("La valeur à la position 1 n'est pas celle attendue",1,test[1]);
        assertEquals("La valeur à la position 2 n'est pas celle attendue",1,test[2]);
        assertEquals("La valeur à la position 11 n'est pas celle attendue",89,test[11]);
        assertEquals("La valeur à la position 20 n'est pas celle attendue",6765,test[20]);
        assertEquals("La valeur à la position 45 n'est pas celle attendue",1134903170,test[45]);

        /*int i = 0;
        for(int in : test)
        {

            System.out.println("Valeur à la position ["+i+"]"+ in);
            i++;
        }*/
    }

    @Test
    public void testOdds()
    {
        int[] test = ControleExec.fillWithOddOnly(150);

        assertEquals("La valeur à la position 0 n'est pas celle attendue",1,test[0]);
        assertEquals("La valeur à la position 4 n'est pas celle attendue",9,test[4]);
        assertEquals("La valeur à la position 17 n'est pas celle attendue",35,test[17]);
        assertEquals("La valeur à la position 26 n'est pas celle attendue",53,test[26]);
        assertEquals("La valeur à la position 88 n'est pas celle attendue",177,test[88]);
        assertEquals("La valeur à la position 119 n'est pas celle attendue",239,test[119]);
        assertEquals("La valeur à la position 149 n'est pas celle attendue",299,test[149]);

        /*int i = 0;
        for(int in: test)
        {
            System.out.println("Valeur à la position ["+i+"]"+ in);
            i++;
        }*/
    }
}

package aw3s0me.tuts.drill_java;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.isA;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void testEntiers()
    {
        //assertThat(Integer.class , instanceOf(types_donnees.entiers(5.0f)));
        assertThat(types_donnees.entiers(5.0f) ,isA(Integer.class));
        assertEquals(5,types_donnees.entiers(5.0f));

        assertThat(types_donnees.entiers(18.6f) ,isA(Integer.class));
        assertEquals(18,types_donnees.entiers(18.6f));

        assertThat(types_donnees.entiers(8918.6456f) ,isA(Integer.class));
        assertEquals(8918,types_donnees.entiers(8918.6456f));
    }

    @Test
    public void testFlottant()
    {
        assertThat(types_donnees.flottant(5) ,isA(Float.class));
        assertEquals(5.0f,types_donnees.flottant(5),0);
    }

    @Test
    public void testAdditionEntierFlottant()
    {
        assertThat(types_donnees.addition_entier_flottant(5 , 15.8f) ,isA(Integer.class));
        assertEquals(20,types_donnees.addition_entier_flottant(5,15));
    }

    @Test
    public void entierLong()
    {
        assertThat(types_donnees.entierLong(2,5) , isA(Long.class));
        assertEquals(32,types_donnees.entierLong(2,5));
    }
}
package com.acetesting.testing.simplestuff;

import jakarta.websocket.OnClose;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalcTest {

    @Test
   void testAddEqualsAndNotEquals(){
        //Set up
        SimpleCalc simpleCalc = new SimpleCalc();

        int expected = 6;
        int unexpected = 8;

        // execute
        int actual = simpleCalc.add(2,4);

        //assert
        assertEquals(expected, actual, "2 + 4 must be 6 ");
        Assertions.assertNotEquals(unexpected, actual, "2 + 4 cant be 8");

    }

    @Test
    void testSubEqualsAndNotEquals(){

        SimpleCalc simpleCalc = new SimpleCalc();

        int expected = 7;
        int unexpected = 10;

        int actual = simpleCalc.sub(17, 10);

        assertEquals(expected, actual);

        assertEquals(expected, actual);
        assertNotEquals(unexpected, simpleCalc.sub(15,4));
    }

   @Test
    void testNullAndNotNull(){

        SimpleCalc simpleCalc = new SimpleCalc();

        String str1 = null;
        String str2 = "Lol";

        assertNull(simpleCalc.checkNull(str1));
        assertNotNull(simpleCalc.checkNull(str2));
   }


}

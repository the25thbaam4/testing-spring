package com.acetesting.testing.simplestuff;

import jakarta.websocket.OnClose;
import jdk.jfr.Enabled;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalcTest {

    @Test
    @EnabledOnOs(OS.LINUX)
    @EnabledOnJre(JRE.JAVA_17)

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
    @EnabledOnOs({OS.WINDOWS, OS.MAC})
    @EnabledForJreRange(min=JRE.JAVA_17, max = JRE.JAVA_21)


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
   @Disabled("Testing annotations")
    void testNullAndNotNull(){

        SimpleCalc simpleCalc = new SimpleCalc();

        String str1 = null;
        String str2 = "Lol";

        assertNull(simpleCalc.checkNull(str1));
        assertNotNull(simpleCalc.checkNull(str2));
   }


}

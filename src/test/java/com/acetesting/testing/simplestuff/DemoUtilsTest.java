package com.acetesting.testing.simplestuff;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class DemoUtilsTest {

    DemoUtils demoUtils;

    @BeforeAll
    static void setupBeforeEachClass() {
        System.out.println("@BeforeAll runs only once before all test methods execution in the class");
    }

    @BeforeEach
    void setupBeforeEach() {
        // set up
        demoUtils = new DemoUtils();
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("@AfterEach Not really need now.");
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll executes once after all test methods execution in the class");
    }

    @Test
    void testEqualsAndNotEquals() {

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "2+4 must be 6");

    }

    @Test
    void testNullNotNull() {
        String str1 = null;
        String str2 = "lol";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), " Object should not be null");

    }
}

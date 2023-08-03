package com.acetesting.testing.simplestuff;

import org.junit.jupiter.api.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@DisplayNameGeneration(DisplayNameGenerator.Simple.class)
//@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
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
      //  System.out.println("@AfterEach Not really need now.");
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("@AfterAll executes once after all test methods execution in the class");
    }

    @Test
    @Order(1)
   // @DisplayName("Equals and not equals")
    void testEqualsAndNotEquals() {

        assertEquals(6, demoUtils.add(2, 4), "2+4 must be 6");
        assertNotEquals(6, demoUtils.add(1, 9), "2+4 must be 6");

    }

    @Order(5)
    @Test
   // @DisplayName("Null not Null")
    void test_Null_And_Not_Null() {
        String str1 = null;
        String str2 = "lol";

        assertNull(demoUtils.checkNull(str1), "Object should be null");
        assertNotNull(demoUtils.checkNull(str2), " Object should not be null");

    }

    @Order(3)

    @Test
    void testSameAndNotSame(){
        String str1 = "learn to test";
        assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Should be the same");
        assertNotSame(str1, demoUtils.getAcademy(), "Should not be the same");

    }

    @Order(-1)

    @Test
    void testTrueFalse(){
        int num1 = 10;
        int num2 = 5;

        assertTrue(demoUtils.isGreater(num1,num2), "Should return true");
        assertFalse(demoUtils.isGreater(num2,num1), "Should return false");

    }
@Order(-15)
    @Test
    void testArrayEquals(){
        String[] stringArray = {"A","B","C"};

        assertArrayEquals(stringArray, demoUtils.getFirstThreeLettersOfAlphabet(), "should be deeply equals");
    }
    @Order(0)

    @Test
    void testIterableEquals(){
        List<String> list = List.of("ace", "luffy","zoro");
        assertIterableEquals(list, demoUtils.getAcademyInList(),"should be true");
        assertLinesMatch(list,demoUtils.getAcademyInList(),"Lines should match");

    }
    @Order(2)

    @Test
    void testThrowsAndDoesNotThrow(){

        assertThrows(Exception.class, ()-> demoUtils.throwException(-1), "Should throw an exception");
        assertDoesNotThrow(()-> {demoUtils.throwException(4);}, "should not throw an exception");
    }

    @Order(10)

    @Test
    void testTimeout(){
       assertTimeoutPreemptively(Duration.ofMillis(3000), () -> demoUtils.checkTimeout(), "Should pass" );
    }

    @Test
    void testMultiply(){
        assertEquals(15, demoUtils.multiply(3,5));
    }

}

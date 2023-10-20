package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScoreSimulatorTest {
    @BeforeEach
    public void demo(){
        System.out.println("before each method");
    }
    @AfterEach
    public void demo1(){
        System.out.println("after each method");
    }
    @BeforeAll
    public static void beforeall(){
        System.out.println("before all method");
    }
    @AfterAll
    public static void afterall(){
        System.out.println("After all method");
    }
    @Test
    void testcalculateCgpa() {
        System.out.println("called testcalculateCgpa");
        ScoreSimulator ss=new ScoreSimulator();
        assertEquals(10.0,ss.calculateCgpa(100));
    }

    @Test
    void testNonCurricularCgpa() {
        System.out.println("called testNonCurricularCgpa");
        ScoreSimulator ss=new ScoreSimulator();
        assertEquals(100,ss.nonCurricularCgpa(70));
    }
}
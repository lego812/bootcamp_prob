package org.scoula.jdbc_ex.test;

import org.junit.jupiter.api.*;


public class JUnitCycleTest {
    @BeforeAll
    static public void beforeAll() {
        System.out.println("@BeforeAll");
    }
    @BeforeEach
    public void beforeEach() {
        System.out.println("@BeforeEach");
    }
    @Test
    public void test() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
    @Test
    public void test3() {
        System.out.println("test3");
    }
    @AfterEach
    public void afterEach() {
        System.out.println("@AfterEach");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("@AfterAll");
    }
}

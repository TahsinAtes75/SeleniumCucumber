package com.cybertek.tests.day7_TestNG;

import org.testng.annotations.*;

public class BeforeAfterClassName {

    @Test
    public void test1() {
        System.out.println("First Test Case");
    }

    @BeforeMethod
    public void setup() {
        System.out.println("WebDriver, Opening Browser");
    }

    @Test
    public void Test2() {
        System.out.println("Test Case 2");
    }
    @Test
    public void Test3() {
        System.out.println("Test Case 3");
    }
    @AfterMethod
    public void tearDown() {
        System.out.println("Close Driver");
    }

    @BeforeClass
    public void setupClass() {
        System.out.println(" ------Before Class-------");
        System.out.println("Classdan once bir defa calisir");

    }
    @AfterClass
    public void tearDownClass() {
        System.out.println("-----After Class");
        System.out.println("clasdan sonra 1 defa calisir");
    }
}
package com.cybertek.tests.day7_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertion {

    @BeforeMethod
    public void setUp() {
        System.out.println("Open browser");

    }

    @Test
    public void test1() {
        System.out.println("First Assertion");
        Assert.assertEquals("title","title");

        System.out.println("Second Assertion");
        Assert.assertEquals("url","url");

    }

    @Test
    public void test2() {
        String expectedTitle = "Amazon";
        String actualTitle = "Amazon.co.uk";   // driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        Assert.assertTrue(actualTitle.startsWith(expectedTitle));
    }

    @Test
    public void test3() {
    // email check @ isareti varmi?
        String expectedEmail= "@";
        String actualEmail = "test@gmail.com";

        Assert.assertTrue(actualEmail.contains("@"),"Verify email contains @ sign");

    }

    @AfterMethod
    public void tearDown() {
        System.out.println("driver quit");

    }
}

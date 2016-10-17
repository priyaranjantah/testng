package com.selenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTest {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Print before each test method");
    }

    @Test
    public void print1(){
        System.out.println("In print 1");
    }
    @Test
    public void print2(){
        System.out.println("In print 2");
    }
}

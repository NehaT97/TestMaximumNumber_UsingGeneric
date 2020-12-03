package com.MaximumNumberTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maximumNumber = new MaximumNumber();

    @Before
    public void init() {
        System.out.println("Welcome to Maximum Test Program");
    }

    @Test
    public void givenMaximumInteger_asFirstIndex_ShouldReturnMaximumInteger() {
        Integer maximumResult = (Integer) maximumNumber.checkMaximum(60, 30, 1);
        Integer expectedResult = 60;
        Assert.assertEquals(expectedResult, maximumResult);
    }

    @Test
    public void givenMaximumInteger_asSecondIndex_ShouldReturnMaximumInteger() {
        Integer maximumResult = (Integer) maximumNumber.checkMaximum(30, 60, 1);
        Integer expectedResult = 60;
        Assert.assertEquals(expectedResult, maximumResult);
    }

    @Test
    public void givenMaximumInteger_asThirdIndex_ShouldReturnMaximumInteger() {
        Integer maximumResult = (Integer) maximumNumber.checkMaximum(1, 30, 60);
        Integer expectedResult = 60;
        Assert.assertEquals(expectedResult, maximumResult);
    }

    @Test
    public void givenMaximumFloat_asFirstIndex_ShouldReturnMaximumFloat() {
        Float maximumResult = (Float) maximumNumber.checkMaximum(1.4f, 1.2f, 1.0f);
        Float expectedResult = 1.4f;
        Assert.assertEquals(expectedResult, maximumResult);
    }

    @Test
    public void givenMaximumFloat_asSecondIndex_ShouldReturnMaximumFloat() {
        Float maximumResult = (Float) maximumNumber.checkMaximum(1.2f, 1.4f, 1.0f);
        Float expectedResult = 1.4f;
        Assert.assertEquals(expectedResult, maximumResult);
    }

    @Test
    public void givenMaximumFloat_asThirdIndex_ShouldReturnMaximumFloat() {
        Float maximumResult = (Float) maximumNumber.checkMaximum(1.0f, 1.2f, 1.4f);
        Float expectedResult = 1.4f;
        Assert.assertEquals(expectedResult, maximumResult);
    }

    @Test
    public void givenMaximumString_asFirstIndex_ShouldReturnMaximumString() {
        String maximumResult = (String) maximumNumber.checkMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", maximumResult);
    }

    @Test
    public void givenMaximumString_asSecondIndex_ShouldReturnMaximumString() {
        String maximumResult = (String) maximumNumber.checkMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", maximumResult);
    }

    @Test
    public void givenMaximumString_asThirdIndex_ShouldReturnMaximumString() {
        String maximumResult = (String) maximumNumber.checkMaximum("Banana", "Apple", "Peach");
        Assert.assertEquals("Peach", maximumResult);
    }
}

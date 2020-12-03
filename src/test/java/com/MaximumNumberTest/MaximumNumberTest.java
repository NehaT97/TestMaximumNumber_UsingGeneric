package com.MaximumNumberTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maximumNumber = new MaximumNumber();

    @Before
    public void init() {
        System.out.println("Welcome to Maximum Number Test Program");
    }

    @Test
    public void givenMaximumInteger_asFirstIndex_ShouldReturnMaximumInteger() {
        Integer maximumResult = maximumNumber.checkMaximumInteger(60, 30, 1);
        Integer expectedResult = 60;
        Assert.assertEquals(expectedResult, maximumResult);
    }

    @Test
    public void givenMaximumInteger_asSecondIndex_ShouldReturnMaximumInteger() {
        Integer maximumResult = maximumNumber.checkMaximumInteger(30, 60, 1);
        Integer expectedResult = 60;
        Assert.assertEquals(expectedResult, maximumResult);
    }

    @Test
    public void givenMaximumInteger_asThirdIndex_ShouldReturnMaximumInteger() {
        Integer maximumResult = maximumNumber.checkMaximumInteger(1, 30, 60);
        Integer expectedResult = 60;
        Assert.assertEquals(expectedResult, maximumResult);
    }


}
package com.MaximumNumberTest;

public class MaximumNumber {

    public Integer checkMaximumInteger(Integer num1, Integer num2, Integer num3) {
        int maxNumber = num1;

        if (num2.compareTo(maxNumber) > 0) {
            maxNumber = num2;
        }

        if (num3.compareTo(maxNumber) > 0) {
            maxNumber = num3;
        }
        System.out.println("Maximum Number : " + maxNumber);
        return maxNumber;
    }
}

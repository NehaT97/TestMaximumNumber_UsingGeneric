package com.MaximumNumberTest;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber<T> {


    /* UC1:  Method to Find Maximum Integer Element */
    public Integer checkMaximumInteger(Integer num1, Integer num2, Integer num3) {
        int maxNumber = num1;

        if (num2.compareTo(maxNumber) > 0) {
            maxNumber = num2;
        }

        if (num3.compareTo(maxNumber) > 0) {
            maxNumber = num3;
        }
        System.out.println("Maximum Integer Number : " + maxNumber);
        return maxNumber;
    }

    /* UC2:  Method to Find Maximum Float Number */
    public Float checkMaximumFloat(Float num1, Float num2, Float num3) {
        float maxNumber = num1;

        if (num2.compareTo(maxNumber) > 0) {
            maxNumber = num2;
        }

        if (num3.compareTo(maxNumber) > 0) {
            maxNumber = num3;
        }
        System.out.println("Maximum Float Number : " + maxNumber);
        return maxNumber;
    }


    /* UC3:  Method to Find Maximum String */
    public String checkMaximumString(String str1, String str2, String str3) {
        String maxString = str1;

        if (str2.compareTo(maxString) > 0) {
            maxString = str2;
        }

        if (str3.compareTo(maxString) > 0) {
            maxString = str3;
        }
        System.out.println("Maximum String : " + maxString);
        return maxString;
    }

    /* UC4 Refactor1 : Using Generic Method */
    public T checkMaximum(T ...object) {
        List<T> listOfEle = Arrays.asList(object);
        T max = listOfEle.get(0);
        GenericComparator<T> comparator = new GenericComparator<T>();
        for (T ele : listOfEle) {
            if (comparator.compare(ele, max) > 0) {
                max = ele;
            }
        }
        return max;
    }
}

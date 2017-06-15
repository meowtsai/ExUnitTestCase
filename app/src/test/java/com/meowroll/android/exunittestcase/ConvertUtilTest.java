package com.meowroll.android.exunittestcase;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Sophie on 2017/6/15.
 */
public class ConvertUtilTest {
    @Test
    public void convertFromFahrenheitToCelsius() throws Exception {

        double input=212;
        double actual ;
        double expected =100;
        double delta =.1;

        ConvertUtil convertUtil = new ConvertUtil();
        actual = convertUtil.convertFromFahrenheitToCelsius(input);

        assertEquals(expected,actual,delta);

    }

    @Test
    public void convertFromCelsiusToFahrenheit() throws Exception {

        double input=100;
        double actual ;
        double expected =212;
        double delta =.1;

        ConvertUtil convertUtil = new ConvertUtil();
        actual = convertUtil.convertFromCelsiusToFahrenheit(input);

        assertEquals(expected,actual,delta);


    }

}
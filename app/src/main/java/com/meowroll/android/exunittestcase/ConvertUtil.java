package com.meowroll.android.exunittestcase;

/**
 * Created by Sophie on 2017/6/15.
 */

public class ConvertUtil {

    public static double convertFromFahrenheitToCelsius(double vFahrenheit)
    {
        double valueC = (vFahrenheit-32)/1.8 ;

        return valueC;


    }

    public static double convertFromCelsiusToFahrenheit(double vCelsius)
    {
        double valueF = (vCelsius*1.8) +32 ;

        return valueF;


    }
}

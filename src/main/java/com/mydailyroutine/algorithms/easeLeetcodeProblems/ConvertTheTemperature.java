package com.mydailyroutine.algorithms.easeLeetcodeProblems;

import com.mydailyroutine.algorithms.AlgosActionDispatcher;

import java.util.Arrays;

//Description:
//You are given a non-negative floating point number rounded to two decimal places celsius, that denotes the temperature in Celsius.
//
//You should convert Celsius into Kelvin and Fahrenheit and return it as an array ans = [kelvin, fahrenheit].
//
//Return the array ans. Answers within 10-5 of the actual answer will be accepted.
//
//Note that:
//
//Kelvin = Celsius + 273.15
//Fahrenheit = Celsius * 1.80 + 32.00
//
//
//Example 1:
//
//Input: celsius = 36.50
//Output: [309.65000,97.70000]
//Explanation: Temperature at 36.50 Celsius converted in Kelvin is 309.65 and converted in Fahrenheit is 97.70.

public class ConvertTheTemperature implements AlgosActionDispatcher {

    @Override
    public void execute() {
        double celsius = 36.50;

        double[] convertTemperature = convertTemperature(celsius);

        System.out.println(Arrays.toString(convertTemperature));
    }

    //Runtime: beats 100% of other solutions.
    //Memory: beats 79% of other solutions.
    private double[] convertTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;

        return new double[] {kelvin, fahrenheit};
    }
}

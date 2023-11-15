package leetcode;

import java.util.Arrays;

// https://leetcode.com/problems/convert-the-temperature/
public class ConvertTheTemperature {

    /*
    Kelvin = Celsius + 273.15
    Fahrenheit = Celsius * 1.80 + 32.00
     */
    public static double[] convertTemperature(double celsius) {
        return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
    }


    public static void main(String[] args) {
        double celsius1 = 36.50;
        double[] output1 = convertTemperature(celsius1); // [309.65000,97.70000]
        System.out.println("output1 = " + Arrays.toString(output1));

        double celsius2 = 122.11;
        double[] output2 = convertTemperature(celsius2); // [395.26000,251.79800]
        System.out.println("output2 = " + Arrays.toString(output2));
    }
}

package Functional_Interface;

import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {

        double temperature = 38.5;


        Predicate<Double> isHighTemp = temp -> temp > 35;

        if (isHighTemp.test(temperature)) {
            System.out.println("⚠️ High Temperature Alert!");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
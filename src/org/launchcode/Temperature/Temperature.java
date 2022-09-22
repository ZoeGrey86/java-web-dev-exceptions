package org.launchcode.Temperature;

public class Temperature {

    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            try{
                throw new TemperatureException("Value is below absolute zero");
            } catch (TemperatureException e){
                e.printStackTrace();
            }
            System.out.println();
        }
    }
}

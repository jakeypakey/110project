package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius(this.getValue());
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue()*(9.0f/5.0f)+32.0f);
    }

    public String toString()
    {
        // TODO: Complete this method
        return  String.valueOf(this.getValue()).concat(" C");
    }
}
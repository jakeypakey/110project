package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        return new Celsius((this.getValue()-32f)*(5.0f/9.0f));
    }

    @Override
    public Temperature toFahrenheit() {
        return new Fahrenheit(this.getValue());
    }

    public String toString()
    {
        // TODO: Complete this method
        return (String.valueOf(this.getValue()).concat(" F"));
    }
}
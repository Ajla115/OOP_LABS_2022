package com.AdditionalTasks;

public class Temperature {
    private double temperature = 0;

    public void setTempKelvin(double tempKelvin){
        this.temperature = tempKelvin;
    }

    public void setTempFahrenheit(double tempFahrenheit){
        this.temperature = (5.0/9) * (tempFahrenheit - 32)+273.15;
    }

    public void setTempCelsius(double tempCelsius){
        this.temperature = tempCelsius + 273.15;
    }

    public String toString(){
        return "" + this.temperature;
    }
}

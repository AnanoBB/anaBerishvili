package com.example.anaBerishvili;

public class Model {

    String cityName;
    int temperature;
    int pressure;
    int humidity;
    String windDirection;
    int windSpeed;

    public String getCityName(){
        return  cityName;
    }

    public void setCityName(String cityName){
        this.cityName = cityName;
    }

    public int getTemperature(){
        return  temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }


    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }


    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }


    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }


    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }


    public Model() {

    }

    public Model(String cityName, int windSpeed,String windDirection,int pressure, int humidity,int temperature){
        this.cityName = cityName;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return  "Weather{" +
                "temperature=" + temperature +
                ", cityName='" + cityName + '\'' +
                ", windSpeed=" + windSpeed +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }



}

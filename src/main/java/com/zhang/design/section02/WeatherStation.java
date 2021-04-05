package com.zhang.design.section02;

/**
 * @ClassName WeatherStation
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/12 23:05
 * @Version 1.0
 **/
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}

package com.zhang.design.section02;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName CurrentConditionDisplay
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/12 23:01
 * @Version 1.0
 **/
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Observable observable;

    private float temperature;

    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + " F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}

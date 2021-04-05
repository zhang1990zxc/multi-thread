package com.zhang.design.section02;

import com.zhang.design.section01.FlyBehavior;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName ForecastDisplay
 * @Description 整条街最靓的仔，写点注释吧
 * @Author 天涯
 * @Date 2021/3/12 23:33
 * @Version 1.0
 **/
public class ForecastDisplay implements Observer, DisplayElement {

    private float currentPressure = 29.92f;

    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("上次：" + lastPressure + " 这次：" + currentPressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }
}

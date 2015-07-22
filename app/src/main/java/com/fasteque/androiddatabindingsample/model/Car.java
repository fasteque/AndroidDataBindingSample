package com.fasteque.androiddatabindingsample.model;

/**
 * Created by danielealtomare on 22/07/15.
 * Project: AndroidDataBindingSample
 */
public class Car {
    private final String manufacturer;
    private final String model;

    public Car(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }
}

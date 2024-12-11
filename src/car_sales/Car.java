package car_sales;

import javax.swing.*;
import java.util.List;

public class Car {
    private String name;
    private String model;
    private double price;
    private int kilometers;
    private String transmission;
    private String fuelType;
    private String year;
    private int power;
    private String color;
    private int previousOwners;
    private List<ImageIcon> images;

    public Car(String name, String model, double price, int kilometers, String transmission, String fuelType,
               String year, int power, String color, int previousOwners, List<ImageIcon> images) {
        /**
         * Test comentariu
         */
        this.name = name;
        this.model = model;
        this.price = price;
        this.kilometers = kilometers;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.year = year;
        this.power = power;
        this.color = color;
        this.previousOwners = previousOwners;
        this.images = images;
    }

    public String getName() { return name; }
    public String getModel() { return model; }
    public double getPrice() { return price; }
    public int getKilometers() { return kilometers; }
    public String getTransmission() { return transmission; }
    public String getFuelType() { return fuelType; }
    public String getYear() { return year; }
    public int getPower() { return power; }
    public String getColor() { return color; }
    public int getPreviousOwners() { return previousOwners; }
    public List<ImageIcon> getImages() { return images; }
}
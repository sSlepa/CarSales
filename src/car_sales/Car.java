package car_sales;

import java.awt.image.BufferedImage;
import javax.swing.*;
import java.util.List;

public class Car {
    private String id;
    private String name;
    private String model;
    private String price;
    private String kilometers;
    private String transmission;
    private String fuelType;
    private String year;
    private String power;
    private String engine;
    private String color;
    private List<BufferedImage> images;
    
    /**
     * 
     * @param name Numele masinii
     * @param model Modelul masinii
     * @param price Pretul in dolari
     * @param kilometers Kilometrii reali
     * @param transmission Tipul cutiei
     * @param fuelType Tip combustibil
     * @param year An fabricatie
     * @param power Cai putere
     * @param color Culoare curenta
     * @param images imaginile reprezentate pe pagina masinii curente
     */
    public Car(String id, String name, String model, String price, String kilometers, String transmission, String fuelType,
               String year, String power, String engine, String color, List<BufferedImage> images) {
        
        this.id = id;
        this.name = name;
        this.model = model;
        this.price = price;
        this.kilometers = kilometers;
        this.transmission = transmission;
        this.fuelType = fuelType;
        this.year = year;
        this.power = power;
        this.engine = engine;
        this.color = color;
        this.images = images;
    }

    /**
     * Functie de tip get ce returneaza numele
     */
    public String getName() { 
        return name; 
    }
    /**
     * Functie de tip get ce returneaza modelul
     */
    public String getModel() { 
        return model; 
    }
    /**
     * Functie de tip get ce returneaza pretul
     */
    public String getPrice() {
        return price; 
    }
    /**
     * Functie de tip get ce returneaza kilometrii
     */
    public String getKilometers() { 
        return kilometers; 
    }
    /**
     * Functie de tip get ce returneaza transmisia
     */
    public String getTransmission() { 
        return transmission; 
    }
    /**
     * Functie de tip get ce returneaza combistibilul
     */
    public String getId() { 
        return id; 
    }
    public String getFuelType() { 
        return fuelType; 
    }
    
    public String getYear() { 
        return year; 
    }
    public String getPower() { 
        return power; 
    }
    public String getEngine(){
        return engine;
    }
    public String getColor() { 
        return color; 
    }
    public List<BufferedImage> getImages() { 
        return images; 
    }
}
package accessories;

import start.Runner;

// Обогреватель
public class Heater {

    private String name;
    private double price;


    public Heater() {
    }

    public Heater(String name, double price) {
        this.name = name;
        this.price = price;
        Runner.totalPrice += this.price;
    }

    public Heater(double price) {
        this.price = price;
        Runner.totalPrice += this.price;
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
//</editor-fold>
}

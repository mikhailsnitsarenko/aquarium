package livingCreatures;

import start.Runner;


public class Turtle {

    private String name;
    private double price;


    public Turtle() {
    }

    public Turtle(String name, double price) {
        this.name = name;
        this.price = price;
        Runner.totalPrice += this.price;
    }

    public Turtle(double price) {
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

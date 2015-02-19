package accessories;

import start.Runner;

// Островок для черепах
public class Island {

    private String name;
    private double price;


    public Island() {
    }

    public Island(String name, double price) {
        this.name = name;
        this.price = price;
        Runner.totalPrice += this.price;
    }

    public Island(double price) {
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

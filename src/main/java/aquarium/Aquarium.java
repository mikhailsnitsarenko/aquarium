package aquarium;

import start.Runner;


public class Aquarium {

    private double price; // цена
    private double capacity; // емкость
    private String durabilityFlewDown; // прочность стекла


    public Aquarium() {
    }

    public Aquarium(double price, double capacity, String durabilityFlewDown) {
        this.price = price;
        this.capacity = capacity;
        this.durabilityFlewDown = durabilityFlewDown;
        Runner.totalPrice = this.price;
    }

    public Aquarium(double price, double capacity) {
        this.price = price;
        this.capacity = capacity;
        Runner.totalPrice = this.price;
    }

    public Aquarium(double price, String durabilityFlewDown) {
        this.price = price;
        this.durabilityFlewDown = durabilityFlewDown;
        Runner.totalPrice = this.price;
    }

    public Aquarium(double price) {
        this.price = price;
        Runner.totalPrice = this.price;
    }

    //<editor-fold defaultstate="collapsed" desc="getters and setters">
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setLiterCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getDurabilityFlewDown() {
        return durabilityFlewDown;
    }

    public void setDurabilityFlewDown(String durabilityFlewDown) {
        this.durabilityFlewDown = durabilityFlewDown;
    }
//</editor-fold>
}

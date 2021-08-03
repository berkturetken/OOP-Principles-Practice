package model;

import enumerator.Builder;
import enumerator.Type;
import enumerator.Wood;

public class Guitar {
    private String serialNumber, model;
    private Builder builder;
    private Type type;
    private Wood backWood, topWood;
    private double price;

    public Guitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood, double price) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

}

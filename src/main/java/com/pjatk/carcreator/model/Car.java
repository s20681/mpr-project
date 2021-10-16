package com.pjatk.carcreator.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Car {
    private double cost;
    private Customer customer;
    private Enum<Color> colorEnum;
    private ArrayList<Upgrade> upgrades = new ArrayList<>();
    private LocalDate deliveryDate;

    public Car(double cost) {
        this.cost = cost;
    }

    public Car(double baseCost, Customer customer) {
        this.cost = baseCost;
        this.customer = customer;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Enum<Color> getColorEnum() {
        return colorEnum;
    }

    public void setColorEnum(Enum<Color> colorEnum) {
        this.colorEnum = colorEnum;
    }

    public ArrayList<Upgrade> getUpgrades() {
        return upgrades;
    }

    public void addUpgrade(Upgrade upgrade) {
        upgrades.add(upgrade);
        cost = cost + upgrade.value;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cost=" + cost +
                ", customer=" + customer +
                ", colorEnum=" + colorEnum +
                ", upgrades=" + upgrades +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}

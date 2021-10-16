package com.pjatk.carcreator.model;

public class Upgrade {
    String description;
    double value;

    public Upgrade(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Upgrade{" +
                "description='" + description + '\'' +
                ", value=" + value +
                '}';
    }
}


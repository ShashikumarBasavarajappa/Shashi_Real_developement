package com.dev.collections;

public class Product {


    private String name;
    private int weight;

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public Product(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return "Name : " + name + " weight : " + weight;
    }


}
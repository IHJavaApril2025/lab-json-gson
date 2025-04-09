package com.example;

import java.util.UUID;

public class Apartment {
    private final String id;
    private String address;
    private double price;
    private int rooms;
    private String description;
    private String owner;
    private boolean isAvailable;

    public Apartment(String address, double price, int rooms, String description, String owner, boolean isAvailable) {
        this.id = UUID.randomUUID().toString();
        this.address = address;
        this.price = price;
        this.rooms = rooms;
        this.description = description;
        this.owner = owner;
        this.isAvailable = isAvailable;
    }
    public Apartment(){
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

   public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", rooms=" + rooms +
                ", description='" + description + '\'' +
                ", owner='" + owner + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

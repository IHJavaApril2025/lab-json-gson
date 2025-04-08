package org.Ironhack;
import java.util.UUID;

public class Apartment {
    private String id;
    private String address;
    private double price;
    private int rooms;
    private String description;
    private String owner;
    private Boolean available;

    public Apartment(String address, double price, int rooms, String description, String owner, Boolean available) {
        this.id = UUID.randomUUID().toString();
        this.address = address;
        this.price = price;
        this.rooms = rooms;
        this.description = description;
        this.owner = owner;
        this.available = available;
    }

    public String getAddresss() {
        return address;
    }

    public void setAddresss(String address) {
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

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", rooms=" + rooms +
                ", description='" + description + '\'' +
                ", owner='" + owner + '\'' +
                ", available=" + available +
                '}';
    }
}

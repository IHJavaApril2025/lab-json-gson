package org.example;
import java.util.UUID;

public class Apartment {
    private String id;
    private String address;
    private int rooms;
    private String description;
    private String owner;
    private boolean available;

    public Apartment(String address, int rooms, String description, String owner, boolean available) {
        setId();
        setAddress(address);
        setRooms(rooms);
        setDescription(description);
        setOwner(owner);
        setAvailable(available);
    }

    private String getId() {
        return this.id;
    }


    public void setId() {
        UUID id = UUID.randomUUID();
        this.id=id.toString();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "Apartment{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", rooms=" + rooms +
                ", description='" + description + '\'' +
                ", owner='" + owner + '\'' +
                ", available=" + available +
                '}';
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
} // end class

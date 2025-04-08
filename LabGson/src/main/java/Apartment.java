import java.util.UUID;

public class Apartment {
    private UUID id;
    private String address;
    private double price;
    private String description;
    private String owner;
    private boolean available;

    public Apartment (String address, double price, String description, String owner, boolean available) {
        this.id = UUID.randomUUID();
        setAddress(address);
        setPrice(price);
        setDescription(description);
        setOwner(owner);
        setAvailable(available);
    }

    public UUID getId() {
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
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }





}



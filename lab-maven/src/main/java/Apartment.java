import java.util.UUID;

public class Apartment {
    private long id;
    private String address;
    private double price;
    private int rooms;
    private String description;
    private String owner;
    private boolean available;

    public Apartment(String address, double price, int rooms, String description, String owner, boolean available) {
        this.id=UUID.randomUUID().getMostSignificantBits();
        setAddress(address);
        setPrice(price);
        setRooms(rooms);
        setDescription(description);
        setOwner(owner);
        setAvailable(available);
    }

    public Apartment() {
        this.id=UUID.randomUUID().getMostSignificantBits();
    }

    //Setters
    public void setAddress(String address) {
        this.address = address;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Getters

    public long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public double getPrice() {
        return price;
    }

    public int getRooms() {
        return rooms;
    }

    public String getDescription() {
        return description;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isAvailable() {
        return available;
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

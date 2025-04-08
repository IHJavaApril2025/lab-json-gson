import java.util.UUID;

public class Apartment {

    private String id;
    private String address;
    private double price;
    private int rooms;
    private String description;
    private String owner;
    private boolean available;

    public Apartment() {
        setId();
    }

    public Apartment(String address, double price, int rooms, String description, String owner, boolean available) {
        setId();
        setAddress(address);
        setPrice(price);
        setRooms(rooms);
        setDescription(description);
        setOwner(owner);
        setAvailable(available);
    }

    public String getId() {
        return id;
    }

    private void setId() {
        this.id = UUID.randomUUID().toString();
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
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id='" + getId() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", price=" + getPrice() +
                ", rooms=" + getRooms() +
                ", description='" + getDescription() + '\'' +
                ", owner='" + getOwner() + '\'' +
                ", available=" + isAvailable() +
                '}';
    }

}

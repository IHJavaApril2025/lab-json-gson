import java.util.UUID;

public class Apartment {
    private UUID id;
    private String address;
    private double price;
    private int rooms;
    private String description;
    private String owner;
    private boolean available;

    public Apartment (String address, double price, int rooms, String description, String owner, boolean available) {
        this.id = UUID.fromString(UUID.randomUUID().toString());
        setAddress(address);
        setPrice(price);
        setRooms(rooms);
        setDescription(description);
        setOwner(owner);
        setAvailable(available);
    }
    public Apartment(UUID id) {
        this.id = UUID.fromString(UUID.randomUUID().toString());
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
    public int getRooms() { return rooms; }

    public void setPrice(double price) {
        this.price = price;
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




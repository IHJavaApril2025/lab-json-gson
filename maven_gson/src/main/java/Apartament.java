import java.util.UUID;

public class Apartament {
    private UUID id;
    private String address;
    private double price;
    private int rooms;
    private String  descripcion;
    private String owner;
    private  boolean available;

    public Apartament(UUID id, String address, double price, int rooms,
                      String descripcion, String owner, boolean available) {
        this.id = UUID.randomUUID();
        this.address = address;
        this.price = price;
        this.rooms = rooms;
        this.descripcion = descripcion;
        this.owner = owner;
        this.available = available;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        return "Apartament{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", price=" + price +
                ", rooms=" + rooms +
                ", descripcion='" + descripcion + '\'' +
                ", owner='" + owner + '\'' +
                ", available=" + available +
                '}';
    }
}

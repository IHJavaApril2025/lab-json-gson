import java.util.UUID;

public class Apartament {
    private String id;
    private String address;
    private double price;
    private int rooms;
    private String  description;
    private String owner;
    private  boolean available;

    public Apartament( String address, double price, int rooms,
                       String description, String owner, boolean available) {
        this.id  =UUID.randomUUID().toString();
        this.address = address;
        this.price = price;
        this.rooms = rooms;
        this.description = description;
        this.owner = owner;
        this.available = available;
    }

    public Apartament() {
        this.id=UUID.randomUUID().toString();
    }

    public String  getId() {
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
                ", description='" + description + '\'' +
                ", owner='" + owner + '\'' +
                ", available=" + available +
                '}';
    }


//    public static void main(String[] args) {
//        Apartament a1=new Apartament("Calle Falsa 123", 500.0, 3, "Amplio y " +
//                "luminoso", "Juan Pérez", true);
//        System.out.println(a1);
//    }
}

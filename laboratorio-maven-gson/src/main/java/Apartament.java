import java.util.UUID;

public class Apartament {

        private String Id;
        private String address;
        private double price;
        private int rooms;
        private String description;
        private String owner;
        private boolean available;

        public  Apartament(){
            this.Id = UUID.randomUUID().toString();
        }
        public Apartament( String address, double price, int rooms, String description, String owner, boolean available) {
            this.Id = UUID.randomUUID().toString();
            this.address = address;
            this.price = price;
            this.rooms = rooms;
            this.description = description;
            this.owner = owner;
            this.available = available;
        }
        public String getId(){
            return Id;
        }
        //Getters
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

        //Setters

        public void setAddress(String address) {
            this.address = address;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public void setRooms(int rooms) {
            this.rooms = rooms;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }
        @Override
        public  String toString(){
            return "Apartment{" +
                    "id=" + Id +
                    ", address='" + address + '\'' +
                    ", price=" + price +
                    ", rooms=" + rooms +
                    ", description='" + description + '\'' +
                    ", owner='" + owner + '\'' +
                    ", available=" + available +
                    '}';
        }
}


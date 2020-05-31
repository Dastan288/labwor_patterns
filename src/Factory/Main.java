package Factory;

public class Main {
    public static void main(String[] args) {
        Logistics a = new Logistics();
        Transport truck = a.createTransport("Truck");
        truck.deliver();
        Transport ship = a.createTransport("Ship");
        ship.deliver();
    }
}

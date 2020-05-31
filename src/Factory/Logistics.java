package Factory;

public class Logistics implements LogisticApp {

    public Transport createTransport(String t) {
        if (t.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        } else if (t.equalsIgnoreCase("SHIP")) {
            return new Ship();
        }
        return null;
    }
}


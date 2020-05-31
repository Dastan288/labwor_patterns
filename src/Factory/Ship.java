package Factory;

public class Ship  implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by sea in a container");
    }
}

package Builder;

public class Director {

    public void buildLargeHouse(Builder builder){
        builder.setType("Large");
        builder.setRooms(12);
        builder.setWindows(6);
        builder.setRoof(new Roof("Gambrel"));
        builder.setWalls(new Walls("Masonry"));// :)
    }



    public void buildFlat(Builder builder){
        builder.setType(" Flat");
        builder.setRooms(3);
        builder.setWindows(2);
        builder.setWalls(new Walls("Wood"));
    }
}

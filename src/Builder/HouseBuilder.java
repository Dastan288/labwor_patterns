package Builder;

public class HouseBuilder implements Builder {
    private String type;
    private int rooms;
    private int Windows;
    private Walls walls;
    private Roof roof;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }


    @Override
    public void setWindows(int Windows) {
        this.Windows = Windows;
    }

    @Override
    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    @Override
    public void setRoof(Roof roof) {
        this.roof = roof;
    }


    public House getResult(){
        return new House(type, rooms, Windows, walls, roof);
    }
}
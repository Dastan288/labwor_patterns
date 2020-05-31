package Builder;

public class House {
    private String type;
    private int rooms;
    private int Windows;
    private Walls walls;
    private Roof roof;

    public House(String type, int rooms, int Windows,  Walls walls, Roof roof) {
        this.type = type;
        this.rooms = rooms;
        this.Windows = Windows;
        this.walls = walls;
        this.roof = roof;
    }

}

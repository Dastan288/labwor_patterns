package Builder;

public class HouseMap {
    private String type;
    private int rooms;
    private int Windows;
    private Walls walls;
    private Roof roof;

    public HouseMap(String type, int rooms, int Windows,  Walls walls, Roof roof) {
        this.type = type;
        this.rooms = rooms;
        this.Windows = Windows;
        this.walls = walls;
        this.roof = roof;
    }

    public String showMap(){
        if(this.type =="Large") {
            return "House Type: " + this.type + "\n" + "Rooms: " + this.rooms + "\n" + "Number of Windows in each room: " + this.Windows + "\n" +
                    "Wall materials: " + this.walls.getWallType() + "\n" + "Roof type: " + this.roof.getRoofType() + "\n";
        }else{
            return "House Type: " + this.type + "\n" + "Rooms: " + this.rooms + "\n" + "Number of Windows in each room: " + this.Windows + "\n" +
                    "Wall materials: " + this.walls.getWallType() + "\n" ;
        }
        }
}

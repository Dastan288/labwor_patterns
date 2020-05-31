package Builder;

import java.util.Scanner;

public class Main {
    private static final Director director = new Director();
    private static final HouseBuilder houseBuilder = new HouseBuilder();
    private static final HouseMapBuilder houseMapBuilder = new HouseMapBuilder();

    public static void forDirector(String str){

        str = str.toLowerCase();

        switch (str) {

            case "large":
                System.out.println("Large house and its map");
                director.buildLargeHouse(houseBuilder);
                director.buildLargeHouse(houseMapBuilder);
                break;
            case "flat":
                System.out.println("Flat  and its map");
                director.buildFlat(houseBuilder);
                director.buildFlat(houseMapBuilder);
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type of house:");
        System.out.println("Large");
        System.out.println("Flat");

        forDirector(in.nextLine());

        House house = houseBuilder.getResult();
        HouseMap houseMap = houseMapBuilder.getResult();

        System.out.println(houseMap.showMap());
    }
}
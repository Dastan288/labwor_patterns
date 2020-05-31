package kz.aitu.oop.labwork.AbstractFactory;

public class Main {

    public static Application config(String s){
        Application app;
        if(s.equalsIgnoreCase("MODERN")){
            app = new Application(new ModernFurnitureFactory());
        }else{
            app = new Application(new VictorianFurnitureFactory());
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = config("Victorian");
        System.out.println(app);
    }
}

package kz.aitu.oop.labwork.AbstractFactory;

public class Application {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;
    public Application(FurnitureFactory factory){
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }
    void delivered(){
        chair.deliver();
        sofa.deliver();
        coffeeTable.deliver();
    }

    public String toString(){
        return chair + "\n" + sofa + "\n" + coffeeTable;
    }
}

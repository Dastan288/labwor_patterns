package kz.aitu.oop.labwork.AbstractFactory;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public void deliver() {
        System.out.println("VictorianCoffeeTable was delivered");
    }
    @Override
    public String toString(){
        return "Victorian coffee table has legs:"+hasLegs();
    }

}

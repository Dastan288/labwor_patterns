package kz.aitu.oop.labwork.AbstractFactory;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void deliver() {
        System.out.println("ModernCoffeeTable was delivered");
    }
    @Override
    public String toString(){
        return "Modern coffee table has legs:"+hasLegs();
    }
}

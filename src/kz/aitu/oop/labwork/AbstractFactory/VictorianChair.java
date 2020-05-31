package kz.aitu.oop.labwork.AbstractFactory;

public class VictorianChair implements Chair{
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public boolean sitOn() {
        return true;
    }

    @Override
    public void deliver() {
        System.out.println("VictorianChair was delivered");
    }
    @Override
    public String toString(){
        return "Victorian chair has Legs:"+hasLegs()+", sit on: "+ sitOn();
    }
}

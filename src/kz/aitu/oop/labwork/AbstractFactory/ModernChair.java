package kz.aitu.oop.labwork.AbstractFactory;

public class ModernChair implements Chair{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean sitOn() {
        return false;
    }

    @Override
    public void deliver() {
        System.out.println("ModernChair was delivered");
    }
    @Override
    public String toString(){
        return "Modern chair, hasLegs:"+hasLegs()+", sitOn: "+ sitOn();
    }
}

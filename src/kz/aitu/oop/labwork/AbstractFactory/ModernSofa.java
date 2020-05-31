package kz.aitu.oop.labwork.AbstractFactory;

public class ModernSofa implements Sofa{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean hasArmrest() {
        return false;
    }

    @Override
    public void deliver() {
        System.out.println("ModernSofa was delivered");
    }
    @Override
    public String toString(){
        return "Modern sofa, hasLegs:"+hasLegs()+", hasArmrest: "+ hasArmrest();
    }
}

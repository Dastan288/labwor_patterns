package kz.aitu.oop.labwork.AbstractFactory;

public class VictorianSofa implements Sofa{

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public boolean hasArmrest() {
        return true;
    }

    @Override
    public void deliver() {
        System.out.println("VictorianSofa was delivered");
    }
    @Override
    public String toString(){
        return "Victorian sofa has legs "+hasLegs()+", has armrest: "+ hasArmrest();
    }
}

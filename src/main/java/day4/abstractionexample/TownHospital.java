package day4.abstractionexample;

public abstract class TownHospital implements IHospital {

    public void emergency(){

        System.out.println("Town Hospital emergency");
    }

    public void billing() {
        System.out.println("Town Hospital Billing ");
    }





}

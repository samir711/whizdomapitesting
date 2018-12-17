package day4.abstractionexample;

public class CityIHospital extends TownHospital {

    @Override
    public void xRay() {
        System.out.println("City Hospital Xray ");

    }

    @Override
    public void ecg() {
        System.out.println("City Hospital ecg ");
    }

//    @Override
//    public void billing() {
//        System.out.println("City Hospital billing ");
//    }
//
//
//    @Override
//    public void emergency() {
//      //  super.emergency();
//        System.out.println("City Hospital emergency ");
//
//    }
}

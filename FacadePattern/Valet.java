package FacadePattern;

public class Valet implements HotelService {

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Picking up vehicle wih plate number " + plateNumber);
    }

    @Override
    public void serve(){

    }
}
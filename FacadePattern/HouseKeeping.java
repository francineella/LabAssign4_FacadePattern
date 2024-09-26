package FacadePattern;

public class HouseKeeping implements HotelService {


    public void cleanRoom(String roomNumber){
        System.out.println("Cleaning room number " + roomNumber);
    }

    @Override
    public void serve(){

    }

}
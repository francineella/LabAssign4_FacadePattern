package FacadePattern;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.valetService("ABC123");
        frontDesk.houseKeepingService("4B");
        frontDesk.cartService(2);

    }
}
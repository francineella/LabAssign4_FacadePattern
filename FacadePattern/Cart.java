package FacadePattern;

public class Cart implements HotelService {


    public void requestCart(int numberOfCarts) {
        System.out.println("Providing " + numberOfCarts + " luggage carts");
    }

    @Override
    public void serve(){

    }
}
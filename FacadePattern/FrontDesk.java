package FacadePattern;

public class FrontDesk {

    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;
    
    public FrontDesk(){
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }
    
    public void valetService(String plateNumber){
        valet.pickUpVehicle(plateNumber);
    }
    public void houseKeepingService(String roomNumber){
        houseKeeping.cleanRoom(roomNumber);
    }
    public void cartService(int numberOfCarts){
        cart.requestCart(numberOfCarts);
    }
    
}
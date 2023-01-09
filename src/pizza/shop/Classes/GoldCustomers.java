package pizza.shop.Classes;

public class GoldCustomers extends Customers{

    public GoldCustomers(String name) {
        super(name);
        System.out.println(this.getName() + ", Customer ID " + getCustomerId() + ", our Gold Customers receive a 5% discount on total bill");
    }

    @Override
    public void placeOrder(Delivery delivery) {
        if(delivery.isPossibility()) {
            this.calculateBill();
            this.setBill((int) (this.getBill() * 0.95));
            System.out.println("Order for " + this.getNumOfFood() +" items customer " + this.getName() + " has been been place for total of Rs." + this.getBill());
            System.out.println("Order delivered to Customer ID " + this.getCustomerId());
        }
        else System.out.println("Cannot Deliver. Number of items exceeded");
        System.out.println();
    }

    @Override
    public void placeOrder(PickUp pickUp) {
        this.calculateBill();
        this.setBill((int) (this.getBill() * 0.95));
        System.out.println("Order for " + this.getNumOfFood() +" items customer " + this.getName() + " has been been place for total of Rs." + this.getBill());
        System.out.println("Order pickup for Customer ID " + this.getCustomerId());
        System.out.println();
    }
}

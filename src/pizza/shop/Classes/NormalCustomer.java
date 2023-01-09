package pizza.shop.Classes;

public class NormalCustomer extends Customers {
    public NormalCustomer(String name) {
        super(name);
    }

    @Override
    public void placeOrder(Delivery delivery) {
        if(delivery.isPossibility()) {
            this.calculateBill();
            System.out.println("Order for " + this.getNumOfFood() +" items customer " + this.getName() + " has been been place for total of Rs." + this.getBill());
            System.out.println("Order delivered to Customer ID " + this.getCustomerId());
        }
        else System.out.println("Cannot Deliver. Number of items exceeded");
        System.out.println();
    }

    @Override
    public void placeOrder(PickUp pickUp) {
        this.calculateBill();
        System.out.println("Order for " + this.getNumOfFood() +" items customer " + this.getName() + " has been been place for total of Rs." + this.getBill());
        System.out.println("Order pickup for Customer ID " + this.getCustomerId());
        System.out.println();
    }
}

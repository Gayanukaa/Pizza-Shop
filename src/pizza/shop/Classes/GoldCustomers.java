package pizza.shop.Classes;

public class GoldCustomers extends Customers{

    public GoldCustomers(String name) {
        super(name);
        System.out.println(this.getName() + ", Customer ID " + getCustomerId() + ", our Gold Customers receive a 5% discount on total bill");
    }

    @Override
    public String placeOrder(Delivery delivery) {
        if(delivery.isPossibility()) {
            this.calculateBill();
            this.setBill((int)(this.getBill() * 0.95));
            return("Order for " + this.getNumOfFood() +" items customer " + this.getName() + " has been been place for total of Rs." + this.getBill() + '\n' + "Order delivered to Customer ID " + this.getCustomerId());
        }
        else return("Cannot Deliver. Number of items exceeded");
    }

    @Override
    public String placeOrder(PickUp pickUp) {
        this.calculateBill();
        this.setBill((int) (this.getBill() * 0.95));
        return("Order for " + this.getNumOfFood() +" items customer " + this.getName() + " has been been place for total of Rs." + this.getBill() + '\n' + "Order pickup for Customer ID " + this.getCustomerId());
    }
}

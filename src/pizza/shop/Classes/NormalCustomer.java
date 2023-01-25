package pizza.shop.Classes;

public class NormalCustomer extends Customers {
    public NormalCustomer(String name) {
        super(name);
    }

    @Override
    public String placeOrder(Delivery delivery) {
        if(delivery.isPossibility()) {
            this.calculateBill();
            return("Order for " + this.getNumOfFood() +" items customer " + this.getName() + " has been been place for total of Rs." + this.getBill() + '\n' + "Order delivered to Customer ID " + this.getCustomerId());
        }
        else return ("Cannot Deliver. Number of items exceeded");
    }

    @Override
    public String placeOrder(PickUp pickUp) {
        this.calculateBill();
        return("Order for " + this.getNumOfFood() +" items customer " + this.getName() + " has been been place for total of Rs." + this.getBill() + '\n' + "Order pickup for Customer ID " + this.getCustomerId());
    }
}

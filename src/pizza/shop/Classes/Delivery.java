package pizza.shop.Classes;

public class Delivery{

    boolean possibility = true;

    public Delivery(Customers customers) {
        if(customers.getNumOfFood() > 5){
            this.possibility = false;}
    }

    public boolean isPossibility() {return possibility;}
}

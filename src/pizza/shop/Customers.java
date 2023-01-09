package com.company;

public abstract class Customers {
    private String name;
    private static int customerId = 0;
    public int bill = 0;
    public int numOfFood = 0;

    public Customers(String name) {     //constructor
        this.name = name;
        customerId = customerId + 1;
    }

    //getters and setters
    public String getName() {return name;}

    public int getCustomerId() {return customerId;}

    public int getBill() {return bill;}

    public void setBill(int bill) {this.bill = bill;}

    public int getNumOfFood() {return numOfFood;}

    public void setNumOfFood(int numOfFood) {this.numOfFood = numOfFood;}

    public void addDrinks(Beverages beverages){     //adding beverages to order
        this.setNumOfFood(this.getNumOfFood() + 1);
        this.setBill(this.getBill() + beverages.sortBevPrice());
    }

    public void addNVegPizza(NonVegPizza nonVegPizza){      //adding non-veg pizza to order
        this.setNumOfFood(this.getNumOfFood() + 1);
        this.setBill(this.getBill() + nonVegPizza.getTotal() + nonVegPizza.sortSizePrice() + nonVegPizza.sortCrustPrice());
    }

    public void addVegPizza(VegPizza VegPizza){     //adding veg pizza to order
        this.setNumOfFood(this.getNumOfFood() + 1);
        this.setBill(this.getBill() + VegPizza.getTotal() + VegPizza.sortSizePrice() + VegPizza.sortCrustPrice());
    }

    public void calculateBill() {
        if (this.getBill() > 5000) {
            this.setBill((int)(this.getBill() * 0.9));
            System.out.println("10% discount applied for orders over Rs.5000");
        }
    }

    //abstract methods to be declared in subclasses
    public abstract void placeOrder(Delivery delivery);
    public abstract void placeOrder(PickUp pickUp);
}

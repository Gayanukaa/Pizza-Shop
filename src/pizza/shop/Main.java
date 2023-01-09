/*package com.company;

import java.util.*;

import static com.company.Pizza.showPizzaCount;

public class Main {

    public static void main(String[] args) { */

        //Choose from the following options
        //Pizza Size options: Small, Medium, Large
        //Pizza Crusts provided: ThinCrust, SausageCrust, PanPizza, CheeseDelight
        //Non-Veg Toppings: Chicken, Fish, Beef, Mutton, Pork, Mushroom, Tomatoes, Chilli
        //Veg Toppings: Olives, Mushroom, Tomatoes, Chilli, Onion
        //Beverages options: Cocacola, Sprite, Fanta, Pepsi, Portello

        /*
        //Scenario 1 - Normal Customer orders for Delivery (Total<5000) Rs.3900
        NormalCustomer normalCustomer1 = new NormalCustomer("Mike");       //creating customer

        NonVegPizza nonVegPizza1 = new NonVegPizza("Small","SausageCrust");  //creating pizza
        nonVegPizza1.addTopping("Chicken");                                 //adding toppings
        nonVegPizza1.addTopping("Mushroom");
        nonVegPizza1.addTopping("Chilli");
        Beverages beverages1 = new Beverages("Sprite"); //creating beverage

        normalCustomer1.addDrinks(beverages1);      //adding items to order
        normalCustomer1.addNVegPizza(nonVegPizza1);

        Delivery delivery1 = new Delivery(normalCustomer1);     //checking out delivery
        normalCustomer1.placeOrder(delivery1);

        //Scenario 2 - Gold Customer orders for Pickup (Total>5000) Rs.6198
        GoldCustomers goldCustomers1 = new GoldCustomers("Sam");        //creating customer

        NonVegPizza nonVegPizza2 = new NonVegPizza("Medium","CheeseDelight");    //creating pizza
        nonVegPizza2.addTopping("Pork");
        nonVegPizza2.addTopping("Tomatoes");
        VegPizza vegPizza1 = new VegPizza("Large","PanPizza");          //creating pizza
        vegPizza1.addTopping("Olives");
        vegPizza1.addTopping("Onion");                                  //adding toppings
        vegPizza1.addTopping("Chilli");
        Beverages beverages2 = new Beverages("Cocacola");
        Beverages beverages3 = new Beverages("Fanta");          //creating beverage

        goldCustomers1.addNVegPizza(nonVegPizza2);                      //adding items to order
        goldCustomers1.addVegPizza(vegPizza1);
        goldCustomers1.addDrinks(beverages2);
        goldCustomers1.addDrinks(beverages3);

        PickUp pickUp1 = new PickUp(goldCustomers1);                   //checking out pickup
        goldCustomers1.placeOrder(pickUp1);

        //Scenario 3 - Gold Customer orders for Delivery (Total>5000)(No. of items > 5)

        GoldCustomers goldCustomers2 = new GoldCustomers("John");        //creating customer

        NonVegPizza nonVegPizza3 = new NonVegPizza("Medium","ThinCrust");    //creating pizza
        nonVegPizza3.addTopping("Pork");
        nonVegPizza3.addTopping("Fish");
        nonVegPizza3.addTopping("Chilli");
        VegPizza vegPizza2 = new VegPizza("Large","SausageCrust");          //creating pizza
        vegPizza2.addTopping("Olives");
        vegPizza2.addTopping("Tomatoes");                                  //adding toppings
        vegPizza2.addTopping("Mushroom");
        VegPizza vegPizza3 = new VegPizza("Small","PanPizza");
        vegPizza3.addTopping("Onion");
        Beverages beverages4 = new Beverages("Portello");
        Beverages beverages5 = new Beverages("Pepsi");          //creating beverage
        Beverages beverages6 = new Beverages("Cocacola");

        goldCustomers2.addNVegPizza(nonVegPizza3);                      //adding items to order
        goldCustomers2.addVegPizza(vegPizza2);
        goldCustomers2.addVegPizza(vegPizza3);
        goldCustomers2.addDrinks(beverages4);
        goldCustomers2.addDrinks(beverages5);
        goldCustomers2.addDrinks(beverages6);

        Delivery delivery2 = new Delivery(goldCustomers2);              //checking out delivery
        goldCustomers2.placeOrder(delivery2);

        //Checking Pizzas made for the day
        vegPizza3.showPizzaCount();
        //nonVegPizza1.showPizzaCount(); - same result //can use any pizza created to check total
        */
/*
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Pizza Shop");
            System.out.println("Are you a Gold(G) or Normal(N) customer?");
            String customer_type = input.next();
            if (customer_type.equals("G")) {
                System.out.println("Enter your name");
                String name = input.next();
                GoldCustomers goldCustomer = new GoldCustomers(name);
                System.out.println("Do you want any Beverages. If so how many? If none enter 0");
                int bevCount = input.nextInt();
                if (bevCount > 0) {
                    int i = 1;
                    System.out.println("Beverages options: Cocacola, Sprite, Fanta, Pepsi, Portello");
                    while (i <= bevCount) {
                        System.out.println("What is the beverage to order");
                        String bevName = input.next();
                        Beverages beverages = new Beverages(bevName);
                        goldCustomer.addDrinks(beverages);
                        i++;
                    }
                }

                System.out.println("Do you want any Non_Veg Pizzas. If so how many? If none enter 0");
                int nonVegCount = input.nextInt();
                if (nonVegCount > 0) {
                    int j = 1;
                    System.out.println("Pizza Size options: Small, Medium, Large");
                    System.out.println("Pizza Crusts provided: ThinCrust, SausageCrust, PanPizza, CheeseDelight");
                    System.out.println("Non-Veg Toppings: Chicken, Fish, Beef, Mutton, Pork, Mushroom, Tomatoes, Chilli");
                    while (j <= nonVegCount) {
                        System.out.println("What is the size of the order");
                        String nonVegSize = input.next();
                        System.out.println("What is the crust of the order");
                        String nonVegCrust = input.next();
                        NonVegPizza nonVegPizza = new NonVegPizza(nonVegSize, nonVegCrust);
                        System.out.println("Choose your no. of toppings");
                        int nonVegTopCount = input.nextInt();
                        int k = 1;
                        while (k <= nonVegTopCount) {
                            System.out.println("What is the topping");
                            String topping = input.next();
                            nonVegPizza.addTopping(topping);
                            k++;
                        }
                        goldCustomer.addNVegPizza(nonVegPizza);
                        j++;
                    }
                }

                System.out.println("Do you want any Veg Pizzas. If so how many? If none enter 0");
                int VegCount = input.nextInt();
                if (VegCount > 0) {
                    int m = 1;
                    System.out.println("Pizza Size options: Small, Medium, Large");
                    System.out.println("Pizza Crusts provided: ThinCrust, SausageCrust, PanPizza, CheeseDelight");
                    System.out.println("Veg Toppings: Olives, Mushroom, Tomatoes, Chilli, Onion");
                    while (m <= VegCount) {
                        System.out.println("What is the size of the order");
                        String vegSize = input.next();
                        System.out.println("What is the crust of the order");
                        String vegCrust = input.next();
                        VegPizza vegPizza = new VegPizza(vegSize, vegCrust);
                        System.out.println("Choose your no. of toppings");
                        int vegTopCount = input.nextInt();
                        int n = 1;
                        while (n <= vegTopCount) {
                            System.out.println("What is the topping");
                            String topping = input.next();
                            vegPizza.addTopping(topping);
                            n++;
                        }
                        goldCustomer.addVegPizza(vegPizza);
                        m++;
                    }
                }
                System.out.println("Do you want to check out as a Pickup(P) or Delivery(D)");
                String orderType = input.next();
                if (orderType.equals("P")) {
                    PickUp pickUp = new PickUp(goldCustomer);
                    goldCustomer.placeOrder(pickUp);
                } else if (orderType.equals("D")) {
                    Delivery delivery = new Delivery(goldCustomer);
                    goldCustomer.placeOrder(delivery);
                } else System.exit(1);
            }
            else if (customer_type.equals("N")) {
                System.out.println("Enter your name");
                String name = input.next();
                NormalCustomer normalCustomer = new NormalCustomer(name);
                System.out.println("Do you want any Beverages. If so how many? If none enter 0");
                int bevCount = input.nextInt();
                if (bevCount > 0) {
                    int i = 1;
                    System.out.println("Beverages options: Cocacola, Sprite, Fanta, Pepsi, Portello");
                    while (i <= bevCount) {
                        System.out.println("What is the beverage to order");
                        String bevName = input.next();
                        Beverages beverages = new Beverages(bevName);
                        normalCustomer.addDrinks(beverages);
                        i++;
                    }
                }

                System.out.println("Do you want any Non_Veg Pizzas. If so how many? If none enter 0");
                int nonVegCount = input.nextInt();
                if (nonVegCount > 0) {
                    int j = 1;
                    System.out.println("Pizza Size options: Small, Medium, Large");
                    System.out.println("Pizza Crusts provided: ThinCrust, SausageCrust, PanPizza, CheeseDelight");
                    System.out.println("Non-Veg Toppings: Chicken, Fish, Beef, Mutton, Pork, Mushroom, Tomatoes, Chilli");
                    while (j <= nonVegCount) {
                        System.out.println("What is the size of the order");
                        String nonVegSize = input.next();
                        System.out.println("What is the crust of the order");
                        String nonVegCrust = input.next();
                        NonVegPizza nonVegPizza = new NonVegPizza(nonVegSize, nonVegCrust);
                        System.out.println("Choose your no. of toppings");
                        int nonVegTopCount = input.nextInt();
                        int k = 1;
                        while (k <= nonVegTopCount) {
                            System.out.println("What is the topping");
                            String topping = input.next();
                            nonVegPizza.addTopping(topping);
                            k++;
                        }
                        normalCustomer.addNVegPizza(nonVegPizza);
                        j++;
                    }
                }

                System.out.println("Do you want any Veg Pizzas. If so how many? If none enter 0");
                int VegCount = input.nextInt();
                if (VegCount > 0) {
                    int m = 1;
                    System.out.println("Pizza Size options: Small, Medium, Large");
                    System.out.println("Pizza Crusts provided: ThinCrust, SausageCrust, PanPizza, CheeseDelight");
                    System.out.println("Veg Toppings: Olives, Mushroom, Tomatoes, Chilli, Onion");
                    while (m <= VegCount) {
                        System.out.println("What is the size of the order");
                        String vegSize = input.next();
                        System.out.println("What is the crust of the order");
                        String vegCrust = input.next();
                        VegPizza vegPizza = new VegPizza(vegSize, vegCrust);
                        System.out.println("Choose your no. of toppings");
                        int vegTopCount = input.nextInt();
                        int n = 1;
                        while (n <= vegTopCount) {
                            System.out.println("What is the topping");
                            String topping = input.next();
                            vegPizza.addTopping(topping);
                            n++;
                        }
                        normalCustomer.addVegPizza(vegPizza);
                        m++;
                    }
                }
                System.out.println("Do you want to check out as a Pickup(P) or Delivery(D)");
                String orderType = input.next();
                if (orderType.equals("P")) {
                    PickUp pickUp = new PickUp(normalCustomer);
                    normalCustomer.placeOrder(pickUp);
                } else if (orderType.equals("D")) {
                    Delivery delivery = new Delivery(normalCustomer);
                    normalCustomer.placeOrder(delivery);
                } else System.exit(1);
            }

            System.out.println("Do you want to stop orders(Stop) or continue(Continue)");
            String choice = input.next();
            if (choice.equals("Stop")) {
                showPizzaCount();
                break;
            }
            else if (choice.equals("Continue")){
                continue;
            }
        }
    }
}*/
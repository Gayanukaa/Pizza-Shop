package com.company;

public class VegPizza extends Pizza{
    private String topping;
    private int vTpPrice = 0;   // vTpPrice - Veg Topping Price
    private int total = 0;      //variables declared for within the class only

    public VegPizza(String size, String crust) {super(size, crust);}
    @Override
    public void addTopping(String topping){     //method to choose topping
        this.topping = topping;
        switch (this.topping){
            case "Olives" : case "Chilli" :
                this.vTpPrice = 500; break;
            case "Mushroom" : this.vTpPrice = 600; break;
            case "Tomatoes" : this.vTpPrice = 450; break;
            case "Onion" : this.vTpPrice = 400; break;
            default : System.exit(1);
        }
        this.total = this.total + this.vTpPrice;
    }

    public int getTotal() {return this.total;}
}

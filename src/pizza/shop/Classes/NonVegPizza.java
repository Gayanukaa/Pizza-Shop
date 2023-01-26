package pizza.shop.Classes;

public class NonVegPizza extends Pizza{
    private String topping;
    private int nvTpPrice = 0;  // nvTpPrice: Non-Veg Topping Price
    private int total = 0;      //variables declared for within the class only

    public NonVegPizza(String size, String crust) {super(size, crust);}

    @Override
    public void addTopping(String topping){     //method to choose topping
        this.topping = topping;
        switch (this.topping){
            case "Chicken" : case "Chilli" :
                this.nvTpPrice = 500; break;
            case "Fish" : this.nvTpPrice = 700; break;
            case "Beef" : case "Mutton" : case "Mushroom" :
                this.nvTpPrice = 600; break;
            case "Pork" : this.nvTpPrice = 650; break;
            case "Tomatoes" : this.nvTpPrice = 450; break;
            default : System.exit(1);
        }
        this.total = this.total + this.nvTpPrice;
    }

    public int getTotal() {return this.total;}
}

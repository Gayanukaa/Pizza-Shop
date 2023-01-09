package pizza.shop.Classes;

public class Beverages {

    private String type;
    private int bevPrice;   //bevPrice - Beverage Price

    public Beverages(String type) {
        this.type = type;
    }

    public int sortBevPrice(){
        switch (this.getType()){
            case "Cocacola" : this.bevPrice = 550; break;
            case "Sprite" : this.bevPrice = 500; break;
            case "Fanta" : this.bevPrice = 500; break;
            case "Pepsi" : this.bevPrice = 550; break;
            case "Portello" : this.bevPrice = 480; break;
            default : System.exit(1);
        }
        return this.bevPrice;
    }
    public String getType() {return type;}
}

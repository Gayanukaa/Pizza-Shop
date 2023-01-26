package pizza.shop.Classes;

import java.util.*;

public abstract class Pizza{
    private static int pizzaCount = 0;
    static Calendar now = new GregorianCalendar();
    private static String todayDate = now.get(Calendar.DATE) + "." + (now.get(Calendar.MONTH)+1) + "." + now.get(Calendar.YEAR);
    private final String crust;
    private int crustPrice;
    private final String size;
    private int sizePrice;

    public Pizza(String size, String crust) {
        this.size = size;
        this.crust = crust;
        pizzaCount = pizzaCount + 1;
    }

    public int sortSizePrice(){        //method to choose size
        switch (this.getSize()){
            case "Small" : this.sizePrice = 300; break;
            case "Medium" : this.sizePrice = 500; break;
            case "Large" : this.sizePrice = 700; break;
            default : System.exit(1);
        }
        return this.sizePrice;
    }
    public String getSize() {return size;}

    public int sortCrustPrice(){        //method to choose crust
        switch (this.getCrust()){
            case "ThinCrust" : this.crustPrice = 1000; break;
            case "SausageCrust" : this.crustPrice = 1500; break;
            case "PanPizza" : this.crustPrice = 1100; break;
            case "CheeseDelight" : this.crustPrice = 1400; break;
            default : System.exit(1);
        }
        return this.crustPrice;
    }
    public String getCrust() {return crust;}

    public abstract void addTopping(String topping);  //method to choose topping

    //method to show pizza count
    public static void showPizzaCount() {System.out.println("Pizza Count for " + todayDate +  " is: " + pizzaCount);}
    
    public static String getPizzaCount() {return("Pizza Count for " + todayDate +  " is: " + pizzaCount);}
}

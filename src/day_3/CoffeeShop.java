package day_3;

public class CoffeeShop {
    public static void main(String[] args) {
        Espresso espresso = new Espresso(60, "My first espresso"); // Create espresso costing 60
        System.out.println(espresso.getPricePublic()); // Print its "public" price
    }
}

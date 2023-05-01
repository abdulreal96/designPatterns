package factory;

public class Test {

    public static void main(String[] args) {

        Restaurant beff = new BeefBurgerRestaurant();
        Burger beffBurger = beff.orderBurger();
        System.out.println("Thanks");

    }
}

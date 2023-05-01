package factory;

public class BeefBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        System.out.println("Burger Created");
        return new BeefBurger();
    }
}

package factory;

public abstract class Restaurant {

    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();

        return burger;
    }

    //Factory method
    public abstract Burger createBurger();

}

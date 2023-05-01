package observer;

public class PhoneDisplay implements Observer{

    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
    }

    public void display(){
        System.out.println("Phone display " + temperature);
    }
}

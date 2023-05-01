package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private List<Observer> observers;
    private float temperature;

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(u -> u.update(temperature));
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers();
    }
}

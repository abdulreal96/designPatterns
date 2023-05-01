package observer;

public class Client {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();
        PhoneDisplay phoneDisplay = new PhoneDisplay();
        PhoneDisplay phoneDisplay2 = new PhoneDisplay();

        weatherStation.registerObserver(phoneDisplay);
        weatherStation.registerObserver(phoneDisplay2);

        weatherStation.setTemperature(25.0f);
        phoneDisplay.display();
        phoneDisplay2.display();
    }


}

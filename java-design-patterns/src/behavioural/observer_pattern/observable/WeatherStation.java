package behavioural.observer_pattern.observable;

import behavioural.observer_pattern.observer.WeatherObserver;

import java.util.ArrayList;
import java.util.List;

// Concrete Observable (Subject)
// WeatherStation - the concrete observable class that holds weather data
public class WeatherStation implements WeatherObservable{

    // List of observers registered for updates
    public final List<WeatherObserver> weatherObservers;

    // Observable Data
    public float temp;
    public float humidity;
    public float pressure;

    public WeatherStation() {
        this.weatherObservers = new ArrayList<>();
    }

    @Override
    public void addObserver(WeatherObserver observer) {
        weatherObservers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        weatherObservers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        // Notify each observer about the change in weather data(state)
        for (WeatherObserver observer : weatherObservers) {
            // Observer will update its state based on the new data and respond accordingly
            observer.update();
        }
    }

    // Method to update weather measurements
    @Override
    public void setWeatherReadings(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temperature;
        this.pressure = pressure;
        notifyObserver();
    }

    // Getters for observers to access weather data
    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}

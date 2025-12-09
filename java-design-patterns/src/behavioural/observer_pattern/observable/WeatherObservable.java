package behavioural.observer_pattern.observable;

import behavioural.observer_pattern.observer.WeatherObserver;

// Observable(Subject) interface
// Defines methods for managing observers and notifying them of changes
public interface WeatherObservable {

    void addObserver(WeatherObserver observer);
    void removeObserver(WeatherObserver observer);
    void notifyObserver();
    void setWeatherReadings(float temperature, float humidity, float pressure);
}

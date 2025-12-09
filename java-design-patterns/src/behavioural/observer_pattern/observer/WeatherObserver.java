package behavioural.observer_pattern.observer;

// Observer interface - defines the update method
// Concrete observers implement this interface to update their state
// and respond to changes in its OWN way
public interface WeatherObserver {
    void update();
}

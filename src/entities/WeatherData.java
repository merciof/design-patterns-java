package entities;

import java.util.ArrayList;

import interfaces.Observer;
import interfaces.Subject;

public class WeatherData implements Subject {
	
	private ArrayList observers;
	private float temperature;
	private float humidity;
	
	public WeatherData( ) {
		observers = new ArrayList<>();
	}
	
	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i>=0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for(int i = 0; i < observers.size(); i++ ) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, temperature);
		}
	}

	@Override
	public void registerObserver (Observer o) {
		//when a observer registers, we just add it to the end of the list
		observers.add(o);
	}
	
	public void measurementsChanged () {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		measurementsChanged();
	}
}

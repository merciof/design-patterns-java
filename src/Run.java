import entities.CurrentConditionsDisplay;
import entities.WeatherData;

public class Run {
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 30, 30.4f);
		weatherData.setMeasurements(100, 50, 10);
	}
}       
package edu.greenriver.edu.exampleprogram;

import edu.greenriver.edu.exampleprogram.db.IWeatherReadingRepository;
import edu.greenriver.edu.exampleprogram.model.WeatherReading;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ExampleProgramApplication {

	public static void main(String[] args) {

		// get access to the spring container (aka the application context)
		ApplicationContext context = SpringApplication.run(ExampleProgramApplication.class, args);

		// ask the spring container for our data layer (a spring brean)
		IWeatherReadingRepository repo = context.getBean(IWeatherReadingRepository.class);

		//records to add to our db
		List<WeatherReading> readings = List.of( new WeatherReading("10/10/12 9pm", "Kent", "Clear Sky", 70.0),
				new WeatherReading("1/2/22", "Auburn", "Rain", 30.0),
				new WeatherReading("3/2/31", "Seattle", "Snow", 10.2),
				new WeatherReading("2/4/12", "Renton", "Sunny", 99.20));

		for (WeatherReading reading: readings) {
			repo.save(reading);
		}

	}

}

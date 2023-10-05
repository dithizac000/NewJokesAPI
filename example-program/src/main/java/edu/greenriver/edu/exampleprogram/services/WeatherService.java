package edu.greenriver.edu.exampleprogram.services;

import edu.greenriver.edu.exampleprogram.model.WeatherReading;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class WeatherService {
    public List<WeatherReading> getAllReadings() {
        return List.of(
                new WeatherReading("10/10/12 9pm", "Kent", "Clear Sky", 70.0),
                new WeatherReading("1/2/22", "Auburn", "Rain", 30.0),
                new WeatherReading("3/2/31", "Seattle", "Snow", 10.2),
                new WeatherReading("2/4/12", "Renton", "Sunny", 99.20)
        );
    }


    public List<Double> getAllTemps() {
        {
            return List.of(70.0, 32.4, 66.0, 68.4);
        }
    }
}

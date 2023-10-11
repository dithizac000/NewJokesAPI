package edu.greenriver.edu.exampleprogram.db;

import edu.greenriver.edu.exampleprogram.model.WeatherReading;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This is a data layer that allows us to access WeatherReading records
 * in our database.
 */
@Repository
public interface IWeatherReadingRepository extends JpaRepository<WeatherReading, Integer> {

} // end of interface

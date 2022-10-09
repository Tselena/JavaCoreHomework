package project;

import enums.Periods;
import project.WeatherData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException, SQLException;

    List<WeatherData> getAllFromDb() throws IOException, SQLException;

}

package org.bitpipeline.lib.owm;

public class OwmTest {

    public static void main(String[] args) throws Exception{
        OwmClient owm = new OwmClient();
        WeatherStatusResponse currentWeather = owm.currentWeatherAtCity("Portland", "USA");
        if (currentWeather.hasWeatherStatus()) {
            WeatherData weather = currentWeather.getWeatherStatus().get(0);
            System.out.println(Math.round(toFahrenheit(weather.getTemp())) + " degrees F");
            if (weather.getPrecipitation() == Integer.MIN_VALUE) {
                WeatherData.WeatherCondition weatherCondition = weather.getWeatherConditions().get(0);
                String description = weatherCondition.getDescription();
                if (description.contains("rain") || description.contains("shower"))
                    System.out.println("No rain measures in Vladivostok but reports of " + description);
                else
                    System.out.println("No rain measures in Vladivostok: " + description);
            } else
                System.out.println("It's raining in Vladivostok: " + weather.getPrecipitation() + " mm/h");
        }
        System.out.println();


    }

    public static float toFahrenheit(float kelvin){
        return (float)((9.0/5.0)*(kelvin-273)+32);
    }

}

/*
package weatherapiapp.WeatherForecast;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class WeatherForecast{
    //member values:
    private String uri;
    //returned values from client

    public WeatherForecast(String uri){
        this.uri = uri;
    }
    
    public void forecast(){
        ObjectMapper mapper = new ObjectMapper();
        WeatherAPIClient clientie = new WeatherAPIClient();
        String json =clientie.getWeatherForecast(uri);
        Period period1;
        try{
            System.out.println(json);
            period1 = mapper.readValue(json, Period.class);
            System.out.println(period1.getName());
        }catch(JsonProcessingException e){
            e.printStackTrace();
        }
    }
}
 */

/*
package weatherapiapp.WeatherForecast;
import java.net.http.*;
import java.net.URI;

public class WeatherAPIClient {

	public String getWeatherForecast(String my_API_URI) {
		HttpClient client = HttpClient.newHttpClient();
		//Scanner input = new Scanner(System.in);
		
		HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create(my_API_URI))
		.build();
		
		
		try{
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			if(response.statusCode() == 200){
				return response.body();
			} else if(response.statusCode() == 418){
				return "Failed. Please contact a coffee pot.";
			} else {
				return "Failed. Status code:" + response.statusCode();
			}

		}catch(Exception e){
			return "Failed. Exception:\n" + e;
		}
	}
}
 */
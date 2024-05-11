import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

// Add functionalities to the search icon
public class LocationService {
    private GeoApiContext context;

    public LocationService(String apiKey) {
        context = new GeoApiContext.Builder()
                .apiKey(apiKey)
                .build();
    }

    public void getAddressCoordinates(String address) {
        try {
            GeocodingResult[] results = GeocodingApi.geocode(context, address).await();
            if (results.length > 0) {
                double latitude = results[0].geometry.location.lat;
                double longitude = results[0].geometry.location.lng;
                // Use latitude and longitude for your application
                System.out.println("Latitude: " + latitude + ", Longitude: " + longitude);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }
    // Other methods and components of your class...
}

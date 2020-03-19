package geo;


import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;

@Service
public class GetVehicles {

	@EventListener(ApplicationReadyEvent.class)
	public List<Point> get() throws IOException {
		final URL URL = new URL("https://ckan2.multimediagdansk.pl/gpsPositions?vehicles");
		InputStreamReader reader = new InputStreamReader(URL.openStream());
		VehiclePOJO vehiclePOJO = new Gson().fromJson(reader, VehiclePOJO.class);
		List<Point> points = new ArrayList<>();
		for(Vehicles i : vehiclePOJO.getVehicles()) {
			points.add(new Point(Double.valueOf(i.getLat()), Double.valueOf(i.getLon()), i.getLine()));
		}
		return points;
	}
	
}

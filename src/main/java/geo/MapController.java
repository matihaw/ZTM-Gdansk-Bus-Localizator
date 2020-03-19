package geo;


import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MapController {
	
	private GetVehicles GetVehicles;

	public MapController(GetVehicles GetVehicles) {
		this.GetVehicles = GetVehicles;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String getMap(Model model) throws IOException {
		model.addAttribute("points", GetVehicles.get());
		return "map";
	}
}

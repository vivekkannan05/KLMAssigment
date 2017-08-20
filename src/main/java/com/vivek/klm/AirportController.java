package com.vivek.klm;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirportController {
	@Autowired
	private AirportDetailsService adService;

	@RequestMapping(method = GET,value="/airportdetails")
	public ResponseEntity<String> getAirports() throws JSONException {
		return adService.getAllAirports();
	}
	
	@RequestMapping(method = GET,value="/airportdetails/{code}")
	public ResponseEntity<String> getAirports(@PathVariable String code) throws JSONException {
		return adService.getAirportDetails(code);
	}

	@RequestMapping(method = GET,value="/faredetails/{from}/{to}")
	public ResponseEntity<String> getAirports(@PathVariable String from,@PathVariable String to) throws JSONException{
		return adService.getFare(from,to);
	}

	
}

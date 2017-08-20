/**
 * 
 */
package com.vivek.klm;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author vivek
 *
 */
@Service
public class AirportDetailsService {

	private final RestTemplate rsTemplate;
	
	@Autowired
	private AirportAccessToken accessToken;
	@Value("${api.airport.url:http://localhost:8080/airports}")
	private String airportUrl;
	@Value("${api.fare.url:http://localhost:8080/fares}")
	private String fareUrl = "http://localhost:8080/fares";
	private String authoriseStr ="Bearer 1c8a6a71-4dc6-47e4-958d-220fbad5d388";
	

	public AirportDetailsService(RestTemplateBuilder builder) {
		rsTemplate = builder.build();
	}
	
	/*	
	    public OAuth2RestTemplate oAuthRestTemplate() {
	        ClientCredentialsResourceDetails resourceDetails = new ClientCredentialsResourceDetails();
	    	//AuthorizationCodeResourceDetails resourceDetails = new AuthorizationCodeResourceDetails();
	        resourceDetails.setClientId("travel-api-client");
	        resourceDetails.setClientSecret("psw");
	        resourceDetails.setAccessTokenUri("http://localhost:8080/oauth/token");
	        resourceDetails.setGrantType("password");
	        resourceDetails.setTokenName("client_credentials");
	        return new OAuth2RestTemplate(resourceDetails,new DefaultOAuth2ClientContext());

	        
	    }*/
	/**
	 * Gets all airport Details
	 * @return
	 * @throws JSONException
	 */
	@SuppressWarnings("rawtypes")
	public org.springframework.http.ResponseEntity<String> getAllAirports() throws JSONException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + accessToken.getToken());		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		
		return rsTemplate.exchange(airportUrl, HttpMethod.GET, entity, String.class);
	}
	
	/**
	 * get airport detail of the input
	 * @param code
	 * @return
	 * @throws JSONException
	 */
	public org.springframework.http.ResponseEntity<String> getAirportDetails(String code) throws JSONException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + accessToken.getToken());//Bearer b63b8360-8588-4d95-bcf1-f8d5c5d3eaa5		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		
		return rsTemplate.exchange(airportUrl+"/"+code, HttpMethod.GET, entity, String.class);
	}

	/**
	 * Get Fare Price for selected route
	 * @param from
	 * @param to
	 * @return
	 * @throws JSONException
	 */
	public ResponseEntity<String> getFare(String from, String to) throws JSONException {
		HttpHeaders headers = new HttpHeaders();
		headers.add("Authorization", "Bearer " + accessToken.getToken());//Bearer b63b8360-8588-4d95-bcf1-f8d5c5d3eaa5		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		
		return rsTemplate.exchange(fareUrl+"/"+from+"/"+to, HttpMethod.GET, entity, String.class);
	
	}
}

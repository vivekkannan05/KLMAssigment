/**
 * 
 */
package com.vivek.klm;



import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author vivek
 *
 */
@Service
public class AirportAccessToken {
	
	private final RestTemplate restTemplate;
	
	public AirportAccessToken(RestTemplateBuilder builder) {
		restTemplate = builder.build();
	}
	
	public String getToken() throws JSONException {
		 MultiValueMap<String, String> body = new LinkedMultiValueMap<>();
		body.add("client_id", "travel-api-client");
		body.add("client_secret", "psw");
		body.add("grant_type", "client_credentials");
		body.add("scope", "read write trust");
		
		HttpEntity<?> httpEnt = new HttpEntity<>(body);
		ResponseEntity<JSONObject> response = restTemplate.exchange("http://localhost:8080/oauth/token", HttpMethod.POST, httpEnt, JSONObject.class); //getForObject("http://localhost:8080/oauth/token", String.class);
		return response.getBody().optString("access_token", "empty");
	}

}

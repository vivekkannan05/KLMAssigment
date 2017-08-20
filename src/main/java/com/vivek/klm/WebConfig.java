/**
 * 
 *//*
package com.vivek.klm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.AccessTokenRequest;
import org.springframework.security.oauth2.client.token.DefaultAccessTokenRequest;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

*//**
 * @author vivek
 *
 *//*
@Configuration
public class WebConfig { //extends WebMvcConfigurerAdapter 

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/index.html").addResourceLocations("classpath:/static/index.html");
    }
    
	
	@Autowired
    private OAuth2ClientContext oauth2Context;
	
	
	
	
	
	
//    @Bean
//	protected OAuth2ProtectedResourceDetails resource(){
//		//ClientCredentialsResourceDetails resourceDetails = new ClientCredentialsResourceDetails();
//    	//AuthorizationCodeResourceDetails resourceDetails = new AuthorizationCodeResourceDetails();
//    	ResourceOwnerPasswordResourceDetails resourceDetails = new ResourceOwnerPasswordResourceDetails();
//        resourceDetails.setClientId("travel-api-client");
//        resourceDetails.setClientSecret("psw");
//        resourceDetails.setAccessTokenUri("http://localhost:8080/oauth/token");
//        resourceDetails.setGrantType("client_credentials");
//        resourceDetails.setScope(Arrays.asList("read","write","trust"));
//        resourceDetails.setTokenName("client_credentials");
//    	return resourceDetails;
//	}
//
//
//	@Bean
//    public OAuth2RestOperations oAuth2RestTemplate() {
//    	
//    	AccessTokenRequest atr = new DefaultAccessTokenRequest();
//
//        return new OAuth2RestTemplate(resource(),new DefaultOAuth2ClientContext(atr));
//
//        
//    }
    
}
*/
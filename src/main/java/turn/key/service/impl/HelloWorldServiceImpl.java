package turn.key.service.impl;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import turn.key.service.HelloWorldService;


public class HelloWorldServiceImpl implements HelloWorldService {

	public String helloWorld() {
		// TODO Auto-generated method stub
		Client client = ClientBuilder.newClient();
		return client.target("http://localhost:9080/turn-key-webapp/rest")
			.path("hello-world")
			.request(MediaType.APPLICATION_JSON_TYPE)
			.get(String.class);
	}

	

}

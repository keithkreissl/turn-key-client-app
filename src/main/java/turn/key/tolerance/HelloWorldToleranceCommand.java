package turn.key.tolerance;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

public class HelloWorldToleranceCommand extends HystrixCommand<String> {
	private String name;
	
	public HelloWorldToleranceCommand(String name){
		super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("DefaultGroup")));
		this.name = name;
		
	}

	@Override
	protected String run() throws Exception {
		Client client = ClientBuilder.newClient();
		return client.target("http://localhost:9080/turn-key-webapp/rest")
			.path("hello-world")
			.request(MediaType.APPLICATION_JSON_TYPE)
			.get(String.class);
	}

	@Override
	protected String getFallback() {
		return "issue with service using fallback for command " + this.name;
	}
	
	

}

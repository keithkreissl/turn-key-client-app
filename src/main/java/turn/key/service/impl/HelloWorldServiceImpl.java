package turn.key.service.impl;

import turn.key.service.HelloWorldService;
import turn.key.tolerance.HelloWorldToleranceCommand;


public class HelloWorldServiceImpl implements HelloWorldService {

	public String helloWorld() {
		return new HelloWorldToleranceCommand("hello").execute();
	}

	

}

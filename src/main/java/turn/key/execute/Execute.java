package turn.key.execute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.hystrix.Hystrix;

import turn.key.service.impl.HelloWorldServiceImpl;

public class Execute {
	private static final Logger logger = LoggerFactory.getLogger(Execute.class);

	public static void main(String[] args) {
		logger.info("calling service");
		System.out.println(new HelloWorldServiceImpl().helloWorld());
		logger.info("finished calling service");
		
		Hystrix.reset();

	}

}

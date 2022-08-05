import java.util.logging.Logger;

public class LoggerTest {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger(LoggerTest.class.getName());
		
		logger.info("First logger");
		logger.info("Second logger");
		logger.warning("Warning 1");
		

	}

}

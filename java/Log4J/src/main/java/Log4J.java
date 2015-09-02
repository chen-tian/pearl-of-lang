import org.apache.log4j.Logger;

public class Log4J {
	private static final Logger log = Logger.getLogger(Log4J.class);
  public static void main (String[] args) {
      log.trace("Trace Message!");
      log.debug("Debug Message!");
      log.info("Info Message!");
      log.warn("Warn Message!");
      log.error("Error Message!");
      log.fatal("Fatal Message!");
  }
}

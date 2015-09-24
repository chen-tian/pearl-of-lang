
package slf4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4J {
private static final Logger log = LoggerFactory.getLogger(Slf4J.class);
  public static void main (String[] args) {
      log.trace("Trace Message!");
      log.debug("Debug Message!");
      log.info("Info Message!");
      log.warn("Warn Message!");
      log.error("Error Message!");
  }
}

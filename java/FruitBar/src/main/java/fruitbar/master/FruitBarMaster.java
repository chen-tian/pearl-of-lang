
package fruitbar.master;

import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

import fruitbar.master.FruitBarServiceHandler;
import fruitbar.thrift.FruitBarService;

public class FruitBarMaster {

  public static final FruitBarServiceHandler handler = new FruitBarServiceHandler();
  public static final FruitBarService.Processor processor = new FruitBarService.Processor(handler);

  public void start() {
    try {
      TServerTransport serverTransport = new TServerSocket(9090);
      TServer server = new TSimpleServer(new Args(serverTransport).processor(processor));
      
      System.out.println("Starting the fruitbar master...");
      server.serve();
    }
    catch (Exception e) {
      System.out.println("Catch exception at server!");
      e.printStackTrace();
    }
  }
}

package fruitbar.client;

import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TBinaryProtocol;

import fruitbar.thrift.Request;
import fruitbar.thrift.Reply;
import fruitbar.thrift.FruitBarService;

public class FruitBarClient {
  private final String fruitName;
  private final int askingCount;

  public FruitBarClient (String name, int count) {
    fruitName = name;
    askingCount = count;
  }

  public void connect() {
    try {
      TTransport transport = new TSocket("localhost", 9090);
      transport.open();
      TProtocol protocol = new TBinaryProtocol(transport);
      FruitBarService.Client client = new FruitBarService.Client(protocol);

      Request req = new Request(fruitName, askingCount);
      Reply reply = client.buyFruit(req);

      String s = String.format("Server reply: %s, price $%d", reply.result, reply.price);
      System.out.println(s);

    } catch (TException e) {
       System.out.println("Catch exception at client!");
       e.printStackTrace();
    }
  }
}

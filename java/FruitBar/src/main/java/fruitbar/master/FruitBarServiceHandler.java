
package fruitbar.master;

import org.apache.thrift.TException;

import fruitbar.thrift.FruitBarService;
import fruitbar.thrift.Request;
import fruitbar.thrift.Reply;

public class FruitBarServiceHandler implements FruitBarService.Iface {
    @Override
    public Reply buyFruit(Request req) throws TException {
       String s = String.format("Asking for: %s, count: %d", req.name, req.count);
       System.out.println(s); 

       Reply r = new Reply(); 
       if (req.name.equals("Orange")) {
         r.result = String.format("Order [%s] is succesful! ($3/each)", req.name); 
         r.price = req.count * 3;
       }
       else if (req.name.equals("Apple")) {
         r.result = String.format("Only has 1 [%s] @ $2/each !", req.name); 
         r.price = 2;
       }
       else {
         r.result = String.format("[%s]is out of stock!", req.name); 
       }
       return r;
    }
} 

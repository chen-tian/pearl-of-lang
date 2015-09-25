package fruitbar;

import fruitbar.master.FruitBarMaster;
import fruitbar.client.FruitBarClient;

class FruitBar {
  public void usage() {
    System.out.println("FruitBar server | client fruitname count");
    System.exit(1);
  }

  void run(String[] argv) {
    if (argv.length == 0) {
      usage();
    }
    if (argv[0].equals("server")) {
      System.out.println("Server is running");
      FruitBarMaster master = new FruitBarMaster();
      master.start();
    }
    else if (argv[0].equals("client")) {
      if (argv.length != 3) {
        usage();
      }
      FruitBarClient client = new FruitBarClient(argv[1], Integer.parseInt(argv[2]));    
      client.connect();
    }
    else {
      usage();
    }
  }

  public static void main (String[] argv) {
    FruitBar fbar = new FruitBar();
    fbar.run(argv);
    return;
  }
}

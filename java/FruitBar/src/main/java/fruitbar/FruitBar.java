package fruitbar;

import fruitbar.master.FruitBarMaster;

class FruitBar {
  public void usage() {
    System.out.println("FruitBar [server|client]");
    System.exit(1);
  }

  void run(String[] argv) {
    System.out.println("argv " + argv.length);
    if (argv.length != 1) {
      usage();
    }
    if (argv[0].equals("server")) {
      System.out.println("Server is running");
      FruitBarMaster master = new FruitBarMaster();
      master.start();
    }
    else if (argv[0].equals("client")) {
      System.out.println("Client is running");
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

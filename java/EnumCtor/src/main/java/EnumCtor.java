
public final class EnumCtor {
  public enum University {
    STANFORD("Palo Alto", "CA", 1),
    MIT("Boston", "MA", 2),
    UOFA("Tuson", "CA", 3);

    public final String city;
    public final String state;
    public final int prio;

    University(String city, String state, int prio) {
      this.city = city;
      this.state = state;
      this.prio = prio;
    }
  }

  public static void main(String[] args) {
    for (University u : University.values()) {
      System.out.printf("University %s is at %s, %s, priority is %d\n", u, u.city, u.state, u.prio);
    }
  }
}

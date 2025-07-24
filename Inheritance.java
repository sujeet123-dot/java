class Calc {
  public int add (int n1, int n2) {
    return n1 + n2;
  }

  public int sub (int n1, int n2) {
    return n1 - n2;
  }
}

public class Inheritance {
  public static void main(String[] args) {
    VeryAdvCalc cal = new VeryAdvCalc();
    int r1 = cal.add(5, 6);
    int r2 = cal.sub(9, 6);
    int r3 = cal.mul(9, 8);
    int r4 = cal.div(9, 3);
    double r5 = cal.power(5, 2);

    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4+ " "+ r5);
  }
}

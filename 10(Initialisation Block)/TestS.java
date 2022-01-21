public class TestS {

  private static int k;
  // Runs in very begining and runs once for a Class
  static {
    System.out.println("Static Intialisation Block:k=" + k);
    k = 5;
  }

  public TestS() {
    System.out.println("Constructor:k=" + k);
  }

  public static void main(String[] args) {
    Test t1 = new Test();
    TestS t2 = new TestS();
  }
}

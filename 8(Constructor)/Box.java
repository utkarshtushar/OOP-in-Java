public class Box {
  private int l, b, h;

  // Constructor
  public Box() {
    l = 10;
    b = 5;
    h = 2;
  }

  public Box(int L, int B, int H) {
    l = L;
    b = B;
    h = H;
  }

  public int Volume() {
    return l * b * h;
  }

  public static void main(String[] args) {
    Box b1 = new Box();
    Box b2 = new Box(20, 15, 5);
    System.out.println(b2.Volume());
  }
}
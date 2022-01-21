class A {
  private int a;

  public A(int x) {
    x = a;
    System.out.println("Hello A");
  }
}

class B extends A {
  private int b;

  public B() {
    super(4);// to call parent Constructor with argument.
    System.out.println("Hello B");
  }
}

public class Example {
  public static void main(String[] args) {
    B obj = new B();
  }
}
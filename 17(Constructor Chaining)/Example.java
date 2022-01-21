class A {
  public A() {
    System.out.println("Hello A");
  }
}

class B extends A {
  public B() {
    this(4); // Constructor Chaining.
    System.out.println("Hello B1");
  }

  public B(int k) {
    // by default call--> super();
    System.out.println("Hello B2");
  }
}

public class Example {
  public static void main(String[] args) {
    B ob = new B();
  }
}

// Output:
// Hello A
// Hello B2
// Hello B1
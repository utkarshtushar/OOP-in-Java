//Function Overloading f1
//Function Overriding f2
class A {
  public void f1(int x) {
    System.out.println("Class A");
  }

  public void f2(int a) {
    System.out.println("Class A");
  }

  
}

class B extends A {
  public void f1(int x,int y) {
    System.out.println("Class B");
  }

  public void f2(int a) {
    System.out.println("Class B");
  }
}

public class Example {
  public static void main(String[] args) {
    B obj = new B();
    obj.f1(5);
    obj.f1(1,2);
    obj.f2(5);
  }

  
}

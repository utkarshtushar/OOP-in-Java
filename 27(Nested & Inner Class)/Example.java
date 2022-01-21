//In java, variables of a class too can have another class as its member.
//Class written within is called the nested/Inner class.
//Class that holds the inner class is called outer class.

//If there is static inner class ,then no need to create object of outer class just create object of inner class as "Outer.Inner o2 = new Outer.Inner(); "

//If Inner class is non static, then we need to create object of outer class first then we can create object of inner class.
// Outer o1 = new Outer();
//Outer.Inner i1 = o1.new Inner();

//Inner class can access all the member of outer class.
//Static inner class can access static member of of outer class.

//Inner class can be private,public,protected or default.
class Outer {
  private int x = 10;

  void fun() {

  }

  // static
  class Inner {
    void if1() {
      System.out.println("Inner class " + x);
    }
  }
}

public class Example {
  public static void main(String[] args) {
    Outer o1 = new Outer();
    Outer.Inner i1 = o1.new Inner();

    // Outer.Inner obj = new Outer.Inner(); //If Static

    i1.if1();
  }
}
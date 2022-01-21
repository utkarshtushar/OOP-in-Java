class Parent{
  static int y=4;
  public static void f1(){
    System.out.println("hello");
  }
}

class Child extends Parent{
  static{
    y=5;
  }
  public static void f1(){
    System.out.println("Yo Man");
  }
}

public class Example {
  public static void main(String[] args) {
    //Child.f1();
    System.out.println("y="+Child.y);
  }
  
}
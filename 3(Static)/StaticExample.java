public class StaticExample{
  private int x;//Instance variable
  public static int y;//static variable

  public void fun1(){
    x=5;
  }//Instance Member Function
  public static void fun2(){
    y=10;
  }//static member function

  static class Test{
    public static String country="India";
  }

  public static void main(String[] args) {
    StaticExample ex1 = new StaticExample();
    StaticExample ex2 = new StaticExample();
    y=5;//can be used directly as in same class
    StaticExample.fun2();//can be used using . operator
    ex1.fun1();

    System.out.println(StaticExample.Test.country);
  }
}
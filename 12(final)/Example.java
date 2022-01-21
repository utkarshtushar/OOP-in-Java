public class Example{
  private final int x;//blank final Variable
  private final static int y;//blank final static Variable
  //Initial in 3 ways and only once:
  /*
   private final int x=5;
  {x=5;} 
  Example{x=5;}
  */

  public void fun(){
    final int k;//blank final local variable
  }
  public static void main(String[] args) {
    Example e1 = new Example();
  }
}

//final class don't have Sub-class.
final class Dummy{

}

class Parent{
  //can't be overriden
  public final void sum(){

  }
}

class Son extends Parent{
  public void sum(){ //gives error

  }
}
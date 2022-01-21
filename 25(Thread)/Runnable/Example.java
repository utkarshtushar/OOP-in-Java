//A thread is an independent path of execution within program.Many Thread can run concurrently within a program.
//Multi-threading refers to two or more tasks executing concurrently within a single program.

//Every Thread in Java is created and controlled by the java.lang.Thread  class
//Two way to create thread in Java:
//a) Implement the Runnable interface(java.lang.Runnable)


class A implements Runnable{
  public void run(){
    int i=0;
    for(i=0;i<10;i++){
      System.out.println("Thread A "+i);
    }
  }
}
class B implements Runnable{
  public void run(){
    int i=0;
    for(i=0;i<10;i++){
      System.out.println("Thread B "+i);
    }
  }
}
public class Example{
  public static void main(String[] args) {
    Thread t1 = new Thread(new A());
    Thread t2 = new Thread(new B());
    t1.start();
    t2.start(); 
  }
}
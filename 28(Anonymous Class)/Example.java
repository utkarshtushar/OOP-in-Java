//An anonymous inner class is an inner class that is decared without using a class name.
//Anonymous class is always inner class and always Sub-Class.

class Greeting {
  public void sayHello() {
    System.out.println("Hello India");
  }
}

class India {
  // Anonumous Class
  // Sub-Class of Greeting
  Greeting g = new Greeting() {
    public void sayHello() {
      System.out.println("Hello Utkarsh");
    }
  };
}

public class Example {
  public static void main(String[] args) {
    India i = new India();
    i.g.sayHello();
  }
}

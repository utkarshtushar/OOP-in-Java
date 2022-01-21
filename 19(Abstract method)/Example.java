//All classes must be abstract Class that gonna contain abstract method in any way.

//Way 1.
abstract class Person {
  abstract void show();//semicolon is given instead of {}.
}

abstract class Student extends Person {
}

public class Example {
  public static void main(String[] args) {
    Student s = new Student();//A class which is abstract can't have object.
  }

  

}

  //Way 2.

  // It is a way of forcing SubClass to override methods of Abstract Class.

abstract class Person {
  abstract void show();//semicolon is given instead of {}.
}

class Student extends Person {
  void show(){ //Override

  }
}

public class Example {
  public static void main(String[] args) {
    Student s = new Student(); //OK
    s.show();
  }

  
}

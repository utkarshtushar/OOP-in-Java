class A{
  //int x;
  int z;
  public void f1(){
    
  }
}

class B extends A{
  //int y;
  int z;
  public void f1(){
    super.f1();
  }
  public void f2() {
    int z;
    z=4;
    this.z=5;//Assign value in B
    super.z=7;// Assign value in A
  }
}

public class Example{
  public static void main(String[] args) {
    B obj = new B();
    obj.f1();
  }
}
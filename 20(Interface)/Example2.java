//Multiple extension is possible in Interface.

//Creation of object is not possible But, creation of Object refrence is possible.

//Object refrence of Interface can refer to any its subclass.

interface I1{
 void f1(){

 }
}

interface I2{
  void f2(){
   
  }
}

interface I3 extends I1,I2{
  //Possible
  void f3(){
   
  }
}

interface I4{
  void f4(){
   
  }
}

class A{
  void fA(){
   
  }
}

class B extends A implements I3,I4{
  void f1(){
   //Definition
  }
  void f2(){
   //Definition
  }
  void f3(){
   //Definition
  }
  void f4(){
   //Definition
  }
  void fA(){
   //Definition
  }
}

public class Example2 {
  public static void main(String[] args) {
    B obj = new B();
    obj.f1();
    obj.f2();
    obj.f3();
    obj.f4();
    obj.fA();

    I3 object = new B();
    obj.f1();//OK
    obj.f2();//OK
    obj.f3();//OK
    obj.f4();//Not OK
    obj.fA();//Not OK

    I2 object1 = new B();
    obj.f1();//Not OK
    obj.f2();//OK
    obj.f3();//Not OK
    obj.f4();//Not OK
    obj.fA();//Not OK
  }



  

}

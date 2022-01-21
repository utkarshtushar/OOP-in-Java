import java.io.IOException;

//Java throw Exception Object to Default catch Mechanism in Exception Situation.
//We handle Exception  by creating our handle code to handle error condition.
//4 Options:- 
//Default throw and default catch
//Default throw and our catch
//Our throw and default catch
//Our throw and our catch.


//Two Kind-> Checked Exception and Unchecked Exception.
//Unchecked Exception are RuntimeException.Eg:-ArrayOutOfBound, NullPointerException
//
public class Example{
public static void main(String[] args) throws IOException {
  //String s1;
  //String s2=null;
  //Default throw and default catch

  //System.out.println("Value: " + 3/0);//ArithmeticException.
  //System.out.println("Value: " + s1.length);//CompilationError.
  //System.out.println("Value: " + s2.length);//NullPointerException.
  
  //Default throw and our catch
  // try{
  //   System.out.println(3/0);
  //   System.out.println("In try");
  // }catch(ArithmeticException e){
  //   System.out.println("Exception: " +e.getMessage());
  // }catch(NullPointerException e){
  //   System.out.println("Exception: " +e.getMessage());
  // }finally{
  //   System.out.println("Utkarsh"); //Run always
  // }

  // System.out.println("Hello");//Run if catch block matches else default catch will come into play.

    //Explicit throw 
    // A Programcan expllicitly throw an exception using throw statement besides the implicit exception thrown.

  //Our throw and default catch

  // int balance = 5000;
  // int withdrawlAmount = 6000;

  // if(balance < withdrawlAmount)
  //   throw new ArithmeticException("Insufficient balance");

  // balance=balance-withdrawlAmount;
  // System.out.println("Transaction Successfully Completed");
  //System.out.println("Program Continue...");


  //Our throw and our catch.
  //We throw an exception object because we want to set a diffrent message.
  //Java can't recognize exceptional situation of business logic.

  // int balance = 5000;
  // int withdrawlAmount = 6000;
  // try{
  //   if(balance < withdrawlAmount)
  //     throw new ArithmeticException("Insufficient balance");

  //   balance=balance-withdrawlAmount;
  //   System.out.println("Transaction Successfully Completed");
  // }catch(ArithmeticException e){
  //     System.out.println("Exception: " +e.getMessage());
  // }

  //   System.out.println("Program Continue...");


  

    //Checked Exception:-CompileTime Error
    //It forces programmers to deals with the exception that may be thrown.
    //IOException,SQLException,IllegalThreadStateException are Checked Exception
    try{
    throw new IOException();
    }catch(IOException e){
      System.out.println("Exception: " +e.getMessage());
    }
    //System.out.println("After Exception ,Program Continue...");
}
}
//E must be non-primitive data type.
//we Can use <E1,E2,E3...> as per requirement.
//We can use E as return type.
public class Example {
//Generic Method
  public <E> void printArray(E []s){
    for(E x:s)
     System.out.println(x);
    }
// //Polymorphism
//   public void printArray(String []s){
//   for(int i=0;i<s.length;i++)
//    System.out.println(s[i]);
//   }

// //Polymorphism
//   public void printArray(Integer []n){
//     for(int i=0;i<n.length;i++)
//      System.out.println(n[i]);
//     }
   
public static void main(String[]args){
  Example e1=new Example();
  String countries[]=new String[]{"India","US","Switzerland"};
  e1.printArray(countries);//Polymorphism
  Integer numbers[]={1,2,4,5,7};
  e1.printArray(numbers);//Polymorphism
 
}
}
 
    



  
  

  
  


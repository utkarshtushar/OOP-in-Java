//String is Immutable CLass
//If 2 or more Strings have same set of characters in same sequence then they refer the same refrence in memeory.

public class StringExample{
public static void main(String[] args) {
  String str1= "My name is Utkarsh";
  String str2= "My name is Utkarsh";
  String str3= "My name "+"is Utkarsh";

  //All str1,str2,str3 denotes same String Object.

  String str4="Bond";
  String str5= "My name is "+str4;;
  String str6= "My name is Bond";
  //Here str5 and str6 denotes same String Object.

  String str7 = new String("My name is Umang");

  String s1 = "Computer";
  String s2 = "Computer";
  String s3 = new String("Computer");

  System.out.println("O1: "+(s1==s2));
  System.out.println("O2: "+s1.equals(s2));
  System.out.println("O1: "+(s1==s3));
  System.out.println("O1: "+s1.equals(s3));
}
}
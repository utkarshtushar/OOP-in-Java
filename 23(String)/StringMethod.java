import java.util.*;

public class StringMethod {
  public static void main(String[] args) {
    String s = new String("Utkarsh");
    String s1 = new String("aaabbbcccddd");

    // System.out.println(s);
    // String s1 = s.toUpperCase();//No change in original String.
    // System.out.println(s);
    // System.out.println(s1);
    // String s2 = s.toLowerCase();//Same here.
    // System.out.println(s);
    // System.out.println(s2);

    int ind = s.indexOf('h');// Character
    System.out.println(ind);
    ind = s.indexOf('m');
    System.out.println(ind);
    ind = s.indexOf("ar");// String
    System.out.println(ind);
    ind = s1.lastIndexOf('c');// Last Index
    System.out.println(ind);
    ind = s1.lastIndexOf("bb");// Last index String
    System.out.println(ind);

    String s2 = "Computer";
    String s3 = "computer";

    System.out.println(s2.equalsIgnoreCase(s3));
    System.out.println(s2.compareTo(s3));
    // 0 means Same
    // negative means same Dictionary Order.
    // positive means Opposite Dictionary Order.

    String s4 = "Akarsh";
    String s5 = s4.substring(2, 5);// [2,5)
    System.out.println(s5);
  }
}
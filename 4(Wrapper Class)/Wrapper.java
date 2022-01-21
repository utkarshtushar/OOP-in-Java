public class Wrapper{
  public static void main(String[] args) {
    Integer i=Integer.valueOf("100110",2);
    Double d=Double.valueOf("112.8618");

    int a = Integer.parseInt("123");
    double b = Double.parseDouble("82.45");

    System.out.println(a);
    System.out.println(b);
    System.out.println(i);
    System.out.println(d.doubleValue());

  }
} 
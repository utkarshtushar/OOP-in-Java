public class Echo{
  public static void main(String[] args) {
    int s=0;
    for(int i=0;i<args.length;i++)
      //System.out.println(args[i]);
      s=s+(Integer.parseInt(args[i]));

    System.out.println("Sum is " + s);
  }
}

//javac Echo.java
//java Echo Tushar from Tamil Nadu.

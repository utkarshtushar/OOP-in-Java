import java.io.*;

public class Example6 {
  public static void main(String[] args) throws IOException {
    // FileWriter fw = new FileWriter("F:/Java Code/26(File Handling)/Buffered
    // Reader/test2.txt",true);
    // BufferedWriter bfw = new BufferedWriter(fw);
    // bfw.write("I love My India.");
    // bfw.close();

    BufferedReader bfr = new BufferedReader(new FileReader("test2.txt"));
    // String s1;
    // while((s1=bfr.readLine())!=null)
    // System.out.println(s1);
    char[] s = new char[25];
    System.out.printf("\n");
    bfr.read(s, 4, 16); // char array,Start ind,no. of letters.
    System.out.println(s);
    bfr.close();
  }
}
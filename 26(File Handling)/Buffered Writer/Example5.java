import java.io.*;
public class Example5{
  public static void main(String[] args)throws IOException{
    FileWriter fw = new FileWriter("F:/Java Code/26(File Handling)/Buffered Writer/test1.txt",true);
    BufferedWriter bf = new BufferedWriter(fw);
    bf.write("computer");
    bf.close();
  }
} 
import java.io.*;
public class FileExample2{
  public static void main(String[] args)throws IOException {
    File f1 = new File("F:/Java Code/26(File Handling)/Writing In File/test.txt");
    f1.createNewFile();
    FileOutputStream fout = new FileOutputStream(f1,true);
    String s = "Toh Kaise Hain Aaplog?";

    char ch[]=s.toCharArray();
    for(int i=0;i<s.length();i++)
      fout.write(ch[i]);

    fout.close();
  }
}
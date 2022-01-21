import java.io.*;
public class Example3{
  public static void main(String[] args)throws IOException {
     File f1 = new File("F:/Java Code/26(File Handling)/Reading From File/test.txt");
    // f1.createNewFile();
    // FileOutputStream fout = new FileOutputStream(f1,true);
    // String s = "Toh Kaise Hain Aaplog?";
    // int i;
    // char ch[]=s.toCharArray();
    // for(i=0;i<s.length();i++)
    //   fout.write(ch[i]);

    // fout.close();
    int i;
    FileInputStream fin = new FileInputStream(f1);
    do{
      i=fin.read();
      if(i!=-1)
        System.out.print((char)i);
    }while(i!=1);

    fin.close();
  }
}
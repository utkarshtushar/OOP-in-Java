import java.io.File;
import java.io.IOException;
public class FileExample1{
  public static void main(String[] args) throws IOException {
    File f1 = new File("F:/Java Code/26(File Handling)/name1.txt");
    f1.createNewFile();//Create if not present.
    System.out.println("File Exists "+f1.exists());
    System.out.println("Can read File "+f1.canRead());
    System.out.println("Can Write File "+f1.canWrite());
    System.out.println("Size of File "+f1.length());
    f1.delete();
  }
}
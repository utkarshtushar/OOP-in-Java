package pack1;
import pack2.Student;
public class Example{
  public static void main(String[] args) {
    Student s1=new Student();
    s1.setRoll(01);
    s1.setName("Utkarsh");
    System.out.println("Roll No.: "+s1.getRoll());
    System.out.println("Name: "+s1.getName());
  }
}
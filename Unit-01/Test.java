import java.util.Scanner;
class Student
{

  // static String name;
  String name;

  void getName()
  {
    System.out.println("Name : " + name + "\n");
  }

  void setName()
  {
    Scanner Input = new Scanner(System.in);
    System.out.println("[+]ENter name  : ");
    name = Input.nextLine();
  
    Input.close();

  }
}

public class Test
{
  public static void main(String...args)
  {
    Student ET20001 = new Student();

    ET20001.setName();
    ET20001.getName();

    Student ET20002 = new Student();
    ET20002.getName();


  }
}

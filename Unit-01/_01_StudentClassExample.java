import java.util.*;
class Student
  {
    private int roll_no;
    private String name;

    public void getData()
    {
     System.out.printf("Student Details : \n"); 
     System.out.printf("[+] Name    : %s \n",this.name); 
     System.out.printf("[+] Roll    : %d \n",this.roll_no); 
    }

  
    public void setData(String name, int roll_no)
    {
      this.roll_no = roll_no;
      this.name = name;
    }


  }


public class _01_StudentClassExample
{

  public static void main(String...args)
  {

    Student Pranay = new Student();
    Pranay.setData("Diya",12);
    Pranay.getData();
  }
}

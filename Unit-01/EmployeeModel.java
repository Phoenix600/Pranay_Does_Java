import java.util.*;

class Employee 
{
  private String employee_name;
  private String depart;
  private int year;

  public void setEmployeeData(String name, String depart, int year)
  {
    this.employee_name = name;
    this.depart = depart;
    this.year = year;
  }

  public void getEmployeeData()
  {
    System.out.printf("[+]Name             :   %s\n", this.employee_name);
    System.out.printf("[+]Department       :   %s\n", this.depart);
    System.out.printf("[+]Year             :   %d\n", this.year);
  }

  public void insertData()
  {
    Scanner input = new Scanner(System.in);

    input.nextLine(); // This flushes the newLine character from the previous input provided by the user
    System.out.print("Enter your Name : ");
    this.employee_name = input.nextLine();
    System.out.print("Enter your Department : ");
    this.depart = input.nextLine();
    System.out.println("Enter your Year : ");
    this.year = input.nextInt();

    input.close();
  }

}


public class EmployeeModel
{

static void createEmployeeDataBase()
{

  int SIZE;

  Scanner input = new Scanner(System.in);

  System.out.println("[+]Enter the number of Employees : ");
  SIZE = input.nextInt();

  Employee[] db = new Employee[SIZE];

  for(int i=0; i<SIZE; i++)
  {
    db[i] = new Employee();
    db[i].insertData();
  }


  for(int i=0; i < SIZE; i++)
  {
    db[i].getEmployeeData();
  }

  input.close();
}




  public static void main(String[] args)
  {
    Employee[] DATA_BASE = new Employee[2];

    // DATA_BASE[0].insertData();
    /*DATA_BASE[0] = new Employee();
    DATA_BASE[0].setEmployeeData("Pranay Rametke","CS",12);
    DATA_BASE[0].getEmployeeData();

    DATA_BASE[1] = new Employee();
    DATA_BASE[1].insertData();
    DATA_BASE[1].getEmployeeData();
*/
    
    createEmployeeDataBase();

  }
}

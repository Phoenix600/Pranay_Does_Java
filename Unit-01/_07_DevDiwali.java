class Employee
{
  private String name;
  private int ID;

  public Employee(String name, int ID)
  {
    this.name = name;
    this.ID = ID;
  }

  public void displayEmployee()
  {
    System.out.println("[+]Employee Name : " + name);
    System.out.println("[+]Employee ID : " + ID);
  }

}

class Developer extends Employee
{
  private int diwali_bonus;

  public Developer(String name,int ID,int diwali_bonus)
  {
    super(name, ID);
    this.diwali_bonus = diwali_bonus;
  }

  void displayDeveloper()
  {
    super.displayEmployee();
    System.out.printf("\nDiwali bonus : %d ", diwali_bonus);
  }
}


public class _07_DevDiwali
{
  public static void main(String...args)
  {
    Developer dev = new Developer("Pranay Ramteke",1212,50000);
    dev.displayDeveloper();
  }
}

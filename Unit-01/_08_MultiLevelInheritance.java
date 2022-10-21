import java.util.Scanner;

class Students
{
  private String name;
  private char section;
  private String branch;

  public Students(String name,char section,String branch)
  {
      this.name = name;
      this.section = section;
      this.branch = branch;
  }

  public void displayStudent()
  {
    System.out.println("[+]Name       : "  + name);
    System.out.println("[+]Section    : " + section);
    System.out.println("[+]Branch     : " + branch);
  }

}

class Marks extends Students 
{
  private int mark;

  Marks(String name, char section, String branch, int mark)
  {
    super(name,section,branch);
    this.mark = mark;
  }
  
  public void displayMark()
  {
    System.out.println("[+]Mark       : " + mark);
  }
}


class Result extends Marks
{
  private boolean result;

  public Result(String name, char section, String branch, int mark)
  {
    super(name,section,branch,mark);
    System.out.println("[+]Your Result Is  : ");
    super.displayStudent();
    super.displayMark();
  
  }
}

public class _08_MultiLevelInheritance
{
  public static void main(String...args)
  {

    Result ET20001 = new Result("Pranay Ramteke",'B',"ETC",89);
  }
}

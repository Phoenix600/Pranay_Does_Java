package Student;

class Student{
  private String name;
  private String section;
  private int roll_no;

  public void setRollNumber(int roll_number)
  {
    this.roll_no = roll_number;
  }

  public int getRollNumber()
  {
    return this.roll_no;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return this.name;
  }

  public void setSection(String section)
  {
    this.section = section;
  }

  public String getSection(String section)
  {
    return this.section;
  }

}

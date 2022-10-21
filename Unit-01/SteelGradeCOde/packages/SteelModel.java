package packages;

public class SteelModel
{
  // Class Fields 
  private int hardness;
  private float carbon_content;
  private float tensile_strength;
  private char grade;

  public SteelModel(int hardness, float carbon_content, float tensile_strength)
  {
    this.hardness = hardness;
    this.carbon_content = carbon_content;
    this.tensile_strength = tensile_strength;
  }


  public void calGrade()
  {
    if(hardness > 50 && carbon_content < 0.7 && tensile_strength > 5.6)
        grade = 'A';
    else if(hardness > 50 && carbon_content < 0.7 )
        grade = 'B';
    else if(hardness > 50 && tensile_strength > 5.6)
       grade = 'D';
    else if(hardness > 50 || tensile_strength > 0.7 || tensile_strength > 5.6)
      grade = 'C';
    else 
      grade = 'E';
  }

  public void getGrade()
  {
      System.out.println("Grade is " + grade);
  }

}

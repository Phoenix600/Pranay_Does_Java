import java.util.Scanner;
class Grader
{
  float score;
  String grade;

  public void letterGrade()
  {
    Scanner input = new Scanner(System.in);
 
    while(true)
    {
 
      System.out.print("[+]Enter your score : ");
      score = input.nextFloat();

      if(score <= 100.0 && score >= 0.0)
      {
              if(score >= 95.0)
              {
                grade = "o";
                System.out.println("Your grade is : "+ grade);
                break;
              }
              else if(score >= 75.0 && score < 95.0)
              {
                grade = "e";
                System.out.println("Your grade is : "+ grade);
                break;
              }
              else if(score >= 60 && score < 75)
              {
                grade = "a";
                System.out.println("Your grade is : "+ grade);
                break;
              }
              else if(score >=  50 && score < 60)
              {
                grade = "b";
                System.out.println("Your grade is : "+ grade);
                break;
              }
              else if(score >= 40 && score < 50)
              {
                grade = "c";
                System.out.println("Your grade is : "+ grade);
                break;
              }
              else 
              {
                grade = "f";
                System.out.println("Your grade is : "+ grade);
                break;
              }
      }
      else{
        System.out.println("Invalid score [X]\n Enter again...\n");
      }
    }

    input.close();
  }

}

public class TestGrader
{
  public static void main(String[] args)
  {
    Grader ET20001 = new Grader();
    ET20001.letterGrade();
  }
}

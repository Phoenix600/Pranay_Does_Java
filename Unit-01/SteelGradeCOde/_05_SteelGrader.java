import packages.SteelModel;
import java.util.*;

public class _05_SteelGrader
{
  public static void main(String...var)
  {
  
    Scanner Input = new Scanner(System.in);

   // SteelModel product_01 = new SteelModel(56,0.8f,9.0f);
   // SteelModel product_01 = new SteelModel(56,0.6f,5.7f);  // A 
    // SteelModel product_01 = new SteelModel(55,0.6f,1.0f); // B
    SteelModel product_01 = new SteelModel(45,5.7f,1); // B
    product_01.calGrade();
    product_01.getGrade();

    Input.close();
  }
}

import java.util.Random;

public class BubbleSort 
{
  static void setArrayKeys(int[] A)
  {
    Random rand = new Random();

    for(int i=0; i<6; i++)
    {
       A[i] = rand.nextInt(50);
    }
  }

  static void printArray(int[] A)
  {
    for(int i=0; i<6; i++)
    {
      System.out.println(A[i]);
    }
  }

 /**
  * Bubble sort algo to sort the single dimensional array 
  * @return int[] array 
  * @author GOD 
  * @impNote :  The following algorithm has Time Complexity of 0(n^2);
  */
  static  int[] bubbleSort(int[] A)
  {
    int[] newArray = new int[6];
    int temp;
    newArray = A;
    for(int i=0; i<6-1; i++)
    {
      for(int j=0; j<6-1; j++)
      {
        if(newArray[j] > newArray[j+1])
        {
          temp = newArray[j];
          newArray[j] = newArray[j+1];
          newArray[j+1] = temp; 
        }
      }
    }

    return newArray;
  }
 /**
  * Adaptive version of Bubble sort algo to sort the single dimensional array, [Optimized Solution]
  * @return int[] array 
  * @author GOD 
  * @impNote :  The following algorithm has Time Complexity of 0(n^2);
  */
  static  int[] adaptiveBubbleSort(int[] A)
  {
    int[] newArray = new int[6];
    int temp;
    boolean isSorted = true;
    newArray = A;
    for(int i=0; i<6-1; i++)
    {
      System.out.printf("Running %d pass \n",i);
      for(int j=0; j<6-1; j++)
      {
        if(newArray[j] > newArray[j+1])
        {
          temp = newArray[j];
          newArray[j] = newArray[j+1];
          newArray[j+1] = temp; 
          isSorted = false;
        }
      }
      if(isSorted)
        return newArray;
    }

    return newArray;
  }


  public static void main(String[] args)
  {
    int[] A = new int[6];

    setArrayKeys(A);
    System.out.println("Unsorted Array : ");
    printArray(A);
    System.out.println("Sorted Array : ");
    bubbleSort(A);
    printArray(A);
    
    int[] B = {1,2,3,4,5,6};
    
    adaptiveBubbleSort(A);
    printArray(A);

    adaptiveBubbleSort(B);
    printArray(B);

  }
}

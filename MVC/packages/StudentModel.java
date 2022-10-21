package packages;
public class StudentModel
{
    private int hashKey;
    private int genKey;


    public void generateArray()
    {
        this.hashKey = 1234; 
        this.genKey = 4321;

    }
    public void displayData()
    {
        System.out.printf("%d",this.hashKey);
        System.out.printf("%d",this.genKey);
    }
}
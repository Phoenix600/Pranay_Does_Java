// import java classes here 

class Brand
{
  private String brand;

  public Brand(String brand)
  {
    this.brand = brand;
  }

  public void print()
  {
    System.out.print("[+]Brand    : " + brand);
  }
}

class Model extends Brand
{
  
  String model;

  public Model(String brand,String model_name)
  {
    super(brand);
    this.model = model_name;
  }

  public void showCaseCar()
  {

    super.print();
    System.out.println("[+] Model     : " + model);
  }

}

public class _06_SingleLevelInheritance
{
  public static void main(String...args)
  {
    Model TeslaS1 = new Model("Tesla","S1");
    TeslaS1.showCaseCar();
  }
}

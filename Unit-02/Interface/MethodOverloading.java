import java.util.Scanner;

interface Area 
{
  void calArea();
}

interface GetArea
{
  void getArea();
};

class CircleShape implements Area,GetArea 
{
  double radius;
  double area;

  public CircleShape()
  {
    Scanner Input = new Scanner(System.in);
    System.out.print("[+]Enter the radius of circle : ");
    this.radius = Input.nextDouble();
    Input.close();
  }

  public void calArea()
  {
      this.radius  = this.radius*3.141*this.radius;
  }

  public void getArea()
  {
    System.out.println("The area is");
  }

}

class Triangle 
{
  double base;
  double height;

  public Triangle()
  {
    Scanner Input = new Scanner(System.in);

    System.out.print("[+]Enter the base of Triangle   : ");
    this.base = Input.nextDouble();
    
    System.out.print("[+]Enter the height of Triangle : ");
    this.height = Input.nextDouble();

    Input.close();
  }

  public calArea()
  {
    System.out.print();
  }
}

class MethodOverloading
{
  public static void main(String[] args)
  {
    
  }
}













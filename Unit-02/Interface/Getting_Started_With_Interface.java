interface Area
{
  void area();
}

class AreaOfCircle implements Area 
{
  public void area()
  {
    System.out.println("[+]Calculating the area of the circle : ");
  }

}

class Main
{
  public static void main(String...args)
  {

    AreaOfCircle C1 = new AreaOfCircle();
    C1.area();

  }
}

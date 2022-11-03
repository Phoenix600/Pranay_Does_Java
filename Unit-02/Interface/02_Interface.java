interface Actions
{
  void intro(String name);
  void running();
  void walking();
  void talking();
  void makingMoney();
}


class NormalMan implements Actions 
{
  String name;

  public NormalMan(String name)
  {
    intro(name);
    running();
    walking();
    talking();
    makingMoney();
  }

  public void intro(String name)
  {
    System.out.println("Hello, Im "  + this.name + ", Member of NormalMan class" );
  }

  public void running()
  {
    System.out.println("My running speed is average");
  }

  public void walking()
  {
    System.out.println("I'm way more confortable in walking");
  }

  public void talking()
  {
    System.out.println("Most Millenial Like Talking");
  }

  public void makingMoney()
  {
    System.out.println("We make sufficient ammount of money");
  }
}


class RichMan implements Actions
{

  String name;

  public RichMan(String name)
  {
    intro(name);
    running();
    walking();
    talking();
    makingMoney();
  }
  
  public void intro(String name)
  {
    System.out.println("Hello, Im "  + this.name + ", Member of RichMan class" );
  }

  public void running()
  {
    System.out.println("My running speed is as fast as my Sport car");
  }

  public void walking()
  {
    System.out.println("I don't like talking...");
  }

  public void talking()
  {
    System.out.println("I'm not most people");
  }

  public void makingMoney()
  {
    System.out.println("I make more money than most people");
  } 
}

class TestClass 
{
  void UnitTestCode()
  {
    RichMan man1 = new RichMan("Pranay Ramteke");
    NormalMan man0 = new NormalMan("Pranay Ramteke");
  }
}

class Main
{
  public static void main(String...args)
  {
    TestClass T1 = new TestClass();
    T1.UnitTestCode();
  }
}

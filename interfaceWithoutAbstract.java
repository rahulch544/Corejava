public class interfaceWithoutAbstract{

  public static void main(String[] args){
    interfaceC c = new interfaceCImpl();

    System.out.println(interfaceC.a);
    System.out.println(c.a);
    c.show();
  }

}


interface interfaceA {

    default void show()
    {
      System.out.println("Default Method Executed");
    }
}


interface interfaceB extends interfaceA{

    default void show()
    {
      System.out.println("Default Method Executed");
    }
}

interface interfaceC {
  int a=8;
  final int b=9;
  void show();
}

class interfaceCImpl implements interfaceC{
 int b=9;
 static int a=9;
int c=10;
  @Override
  public void show() {
    System.out.println("InterfaceC IMPl Method Executed "+c);
    
  }

}
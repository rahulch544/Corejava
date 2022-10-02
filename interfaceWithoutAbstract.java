public class interfaceWithoutAbstract{


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
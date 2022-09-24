import java.io.IOException;

public class ExpectionInheritance {
    
}


class ParentException {

    void fcnA() throws IOException{
        System.out.println("ParentException fcnA");
    }

    void fcnB() throws Exception{
        System.out.println("ParentException fcnA");
    }
}

class ChildException1 extends ParentException {

    void fcnA() throws IOException{
        System.out.println("ChildException1 fcnA");
    }
}

class ChildException2 extends ParentException {

      void fcnA() throws IOException{
        System.out.println("ChildException2 fcnA");
    }
}
class ChildException3 extends ParentException {

    void fcnA() throws Exception{
      System.out.println("ChildException3 fcnA");
  }
}


class ChildException4 extends ParentException {

    void fcnA(){
        System.out.println("ChildException4 fcnA");
    }

}

class ChildException5 extends ParentException {

    void fcnB() throws IOException,Exception{
        System.out.println("ChildException5 fcnA");
    }

}


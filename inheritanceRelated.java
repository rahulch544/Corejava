public class inheritanceRelated {
    
    public static void main(String[] args) {

        ParentA parentA = new ParentA();
        System.out.println("parentA a:" + parentA.a);
        parentA.fcnA();

        System.out.println("Inheritance Start ");
        ParentA childAparentCopy = new ChildAparentCopy();
        System.out.println("childAparentCopy a:" + parentA.a);
        childAparentCopy.fcnA();

        ChildAparentCopy childAparentCopy1 = new ChildAparentCopy();
        System.out.println("childAparentCopy1 a:" + childAparentCopy1.a);
        childAparentCopy1.fcnA();

        ParentA childAparent = new ChildAparent();
        System.out.println("childAparent a:" + childAparent.a);
        // System.out.println("childAparent b:" + childAparent.b);
        childAparent.fcnA();

        ChildAparent childAparent1 = new ChildAparent();
        System.out.println("childAparent1 a:" + childAparent1.a);
        System.out.println("childAparent1 b:" + childAparent1.b);
        childAparent1.fcnA();

        ParentA childAparentOveride = new ChildAparentOveride();
        System.out.println("childAparent a:" + childAparentOveride.a);
        // System.out.println("childAparent b:" + childAparentOveride.b);
        childAparentOveride.fcnA();

        ParentA childAparentOverideVar = new ChildAparentOverideVar();
        System.out.println("childAparentOverideVar a:" + childAparentOverideVar.a);
        // System.out.println("childAparentOverideVar b:" + childAparentOverideVar.b);
        childAparentOverideVar.fcnA();

        ParentA childAparentOveridenewFcn = new ChildAparentOveridenewFcn();
        System.out.println("childAparentOveridenewFcn a:" + childAparentOveridenewFcn.a);
        childAparentOveridenewFcn.fcnA();
        // childAparentOveridenewFcn.fcnB();

        ChildAparentOveridenewFcn childAparentOveridenewFcn1 = new ChildAparentOveridenewFcn();
        System.out.println("childAparentOveridenewFcn1 a:" + childAparentOveridenewFcn1.a);
        childAparentOveridenewFcn1.fcnA();
        childAparentOveridenewFcn1.fcnB();
    }
}

class ParentA {

    int a=1;
    void fcnA(){
        System.out.println("PrintA Dummy");
    }
}


class ChildAparentCopy extends ParentA{

}

class ChildAparent extends ParentA{
    int b=2;
}

class ChildAparentOveride extends ParentA{
    
    void fcnA(){
        System.out.println("ChildAparentOveride Dummy");
    }
}


class ChildAparentOverideVar extends ParentA{
    int a=5;
    void fcnA(){
        System.out.println("ChildAparentOverideVar Dummy");
    }
}

class ChildAparentOveridenewFcn extends ParentA{
    
    void fcnB(){
        System.out.println("ChildAparentOveridenewFcnB Dummy");
    }
}
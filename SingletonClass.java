import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Inorder to prevent from reflection class type should be changed to Enum
public class SingletonClass implements Serializable {
    public static SingletonClass singletonClass;
    private SingletonClass(){
    }


    // to prevent from clone method
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
      return super.clone();
    }

    public static SingletonClass getInstance(){
        // if(singletonClass == null)
        //     singletonClass = new SingletonClass();
        // return singletonClass;  
        
        if (singletonClass == null)
        {
          //synchronized block to remove overhead
          synchronized (SingletonClass.class)
          {
            if(singletonClass==null)
            {
              // if instance is null, initialize
              singletonClass = new SingletonClass();
            }
           
          }
        }
        return singletonClass;
    }

    // implement readResolve method from serialization effect
    protected Object readResolve(){
            return getInstance();
    }


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
        SingletonClass instance11 = SingletonClass.getInstance();
        System.out.println("instance11 "+instance11.hashCode());



        // try
        // {
            SingletonClass instance1 = SingletonClass.getInstance();
            ObjectOutput out
                = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();
     
            // deserialize from file to object
            ObjectInput in
                = new ObjectInputStream(new FileInputStream("file.text"));
             
            SingletonClass instance2 = (SingletonClass) in.readObject();
            in.close();
     
            System.out.println("instance1 hashCode:- "
                                                 + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                                                 + instance2.hashCode());
        // }
         
        // catch (Exception e)
        // {
            // e.printStackTrace();
        // }

    }

}

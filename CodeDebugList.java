import java.util.ArrayList;
import java.util.List;

public class CodeDebugList {

    public static void replaceList(List<String> strList){
        strList = null;
    }

    public static void addToList(List<String> strList){
        strList.add("Carrot");
    }

    public static void replaceWithNewList(List<String> strList){
        strList = new ArrayList<String>();
        strList.add("Apples");
        strList.add("Bananas");
        strList.add("PineApples");
    }

    public static void main(String[] args){
        List<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Banana");
        strList.add("PineApple");
        System.out.println("List before making its ref to Null");
        System.out.println(strList);
        replaceList(strList);
        System.out.println("List after making its ref to Null in function");
        System.out.println(strList);
        System.out.println("****************************************************************");
        System.out.println("List before making add to elements");
        System.out.println(strList);
        addToList(strList);
        System.out.println("List after making adding element to Null in function");
        System.out.println(strList);
        System.out.println("****************************************************************");
        System.out.println("List before making Replacing with new  elements");
        System.out.println(strList);
        replaceWithNewList(strList);
        System.out.println("List after making adding elements");
        System.out.println(strList);



    }


}

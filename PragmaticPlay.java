package org.example;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class Main {

//     Input: digits = [9]
//        Output: [1,0]
//     Input: digits = [4,3,2,1]
//        Output: [4,3,2,2]
//    3 4 9 3 7 9 9
//     0 0 9

//    8 8
//    public static Integer[] addDigit(Integer[] arr ){
//
//        Integer lastPrevLess9Idx =-1;
//        int lengthOfArr = arr.length;
//
//        for(Integer i=0;i<lengthOfArr;i++){
//
//            if(arr[i]<9){
//                lastPrevLess9Idx=i;
//            }
//        }
//
//        if(lastPrevLess9Idx==-1){
//            Integer[] result = new Integer[lengthOfArr+1];
//            result[0] =1;
//            return result;
//        }else{
//            arr[lastPrevLess9Idx]++;
//
//            for(Integer i=lastPrevLess9Idx+1;i<lengthOfArr;i++){
//                arr[i]=0;
//            }
//            return arr;
//        }
//
//
//    }
    public static Integer getFirstOccurence(Integer[] arr,Integer val, Integer offset){
        Integer ptr =arr.length;
        for(int i=offset;i<arr.length;i++){
            if(arr[i]==val){
                ptr=i;
                break;
            }
        }
        return ptr;
    }
    public static Integer getFirstNonOccurence(Integer[] arr,Integer val, Integer offset){
        Integer ptr =arr.length;
        for(int i=offset;i<arr.length;i++){
            if(arr[i]!=val){
                ptr=i;
                break;
            }
        }
        return ptr;
    }
    public static void replaceInplace(Integer[] arr, Integer val){

        Integer valPtr =-1;
        Integer nonValPtr =-1;

        Integer lengthOfArr = arr.length;

        // Set Val pointer to first occurence of val
        valPtr  = getFirstOccurence(arr,val,0);

        // Set nonVal pointer to first occurence of non val after Val pointer
        nonValPtr = getFirstNonOccurence(arr,val,valPtr+1);

        while(valPtr <lengthOfArr || nonValPtr <lengthOfArr){

                if(nonValPtr < valPtr){
                    nonValPtr = getFirstNonOccurence(arr,val,valPtr+1);
                }

                if(nonValPtr == lengthOfArr)
                    break;

                arr[valPtr]=arr[nonValPtr];
                arr[nonValPtr]=val;

                //get next val ptr location
                valPtr = getFirstOccurence(arr,val,valPtr+1);

              //get next non val ptr location after val Ptr
                nonValPtr = getFirstNonOccurence(arr,val,valPtr+1);

        }



    }
    public static void printArr(Integer[] arr){
        int lengthOfArr = arr.length;

        for(int i=0;i<lengthOfArr;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args){
        Integer[] arrayInt1 = {0,1,3,2,2,0,4,2};
        printArr(arrayInt1);
        replaceInplace(arrayInt1,2);
        printArr(arrayInt1);

        Integer[] arrayInt2 = {0,1,2,2,3,0,4,2};
        printArr(arrayInt2);
        replaceInplace(arrayInt2,2);
        printArr(arrayInt2);
    }
}
//class Singleton {
//     public volatile static Singleton singletonInstance;
//
//     private Singleton(){
//
//     }
//    public   void test(){
//        if(singletonInstance==null){
//            synchronized(this){
//                if(singletonInstance==null){
//                    singletonInstance = new Singleton();
//                }
//            }
//        }
////        return singletonInstance;
//    }
//     public  static Singleton getInstance(){
//         if(singletonInstance==null){
//             synchronized(Singleton.class){
//                 if(singletonInstance==null){
//                    singletonInstance = new Singleton();
//                 }
//             }
//         }
//
//
//
//         return singletonInstance;
//    }
//
//
//
//}
//public class Main {
//
//    public static void replaceList(List<String> strList){
//        strList = null;
//    }
//
//    public static void addToList(List<String> strList){
//        strList.add("Carrot");
//    }
//
//    public static void replaceWithNewList(List<String> strList){
//        strList = new ArrayList<String>();
//        strList.add("Apples");
//        strList.add("Bananas");
//        strList.add("PineApples");
//    }
//
//    public static void main(String[] args){
//        List<String> strList = new ArrayList<>();
//        strList.add("Apple");
//        strList.add("Banana");
//        strList.add("PineApple");
//        System.out.println("List before making its ref to Null");
//        System.out.println(strList);
//        replaceList(strList);
//        System.out.println("List after making its ref to Null in function");
//        System.out.println(strList);
//        System.out.println("****************************************************************");
//        System.out.println("List before making add to elements");
//        System.out.println(strList);
//        addToList(strList);
//        System.out.println("List after making adding element to Null in function");
//        System.out.println(strList);
//        System.out.println("****************************************************************");
//        System.out.println("List before making Replacing with new  elements");
//        System.out.println(strList);
//        replaceWithNewList(strList);
//        System.out.println("List after making adding elements");
//        System.out.println(strList);
//
//
//
//    }
//
//
//}


/*
[15:19] Pavan Muthukuru

        Example 1:


        Input: digits = [1,2,3]
        Output: [1,2,4]
        Explanation: The array represents the integer 123.
        Incrementing by one gives 123 + 1 = 124.
        Thus, the result should be [1,2,4].
        Example 2:


        Input: digits = [4,3,2,1]
        Output: [4,3,2,2]
        Explanation: The array represents the integer 4321.
        Incrementing by one gives 4321 + 1 = 4322.
        Thus, the result should be [4,3,2,2].
        Example 3:


        Input: digits = [9]
        Output: [1,0]
        Explanation: The array represents the integer 9.
        Incrementing by one gives 9 + 1 = 10.
        Thus, the result should be [1,0].


*/

/*
[15:39] Pavan Muthukuru

Example 1:


Input: nums = [3,2,2,3], val = 3
Output:  nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

int firstIdxOfVal =-1;
for(int i=0;i<arr.length();i++){
    if(arr[i] == val){
        firstIdxOfVal = i;
        break;
    }
}
//[0,1,2,2,2,2,4,2 1 2] val=2
=> 0 1 3 0 4 2 2 2

firstIdxOfVal = 2;

3 =>\
 0 1 2 3 4 5 6 7
[0,1,2,2,3,0,4,2]
firstValPtr = 2
SecondValPtr = 0


[0,1,3,2,2,0,4,2]

0 1 2 3 4 5 6 7 8 9 10 11 12
2 2 2 4 2 2 2 2 4 4 4  4  4
4 2 2 2 2 2 2 2 2 4 4  4  4





for(int i=firstIdxOfVal+1;i<arr.length();){

    if(arr[i] !=val){
        arr[firstIdxOfVal] = arr[i];
        arr[i] = val;

     for(int j= firstIdxOfVal+1;j<arr.length();j++){
            if(arr[j] == val){
            firstIdxOfVal = j;
            break;
            }
        }

    }

  i= max(i+1,firstIdxOfVal+1);


}



Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).





 */

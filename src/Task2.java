import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Task2 {
    static Scanner in;
    static int [] Input()
    {
    System.out.println("Input array size n<=300");
    int n=in.nextInt();
    while(n > 300 || n<=0){
        System.out.println("Incorrect value |" + n + '|');
        System.out.println("Enter n <=300 : ");
        n = in.nextInt();

    }
    int []a=new int[n];
    for (int i = 0; i < n; ++i)
    {
    System.out.print("a["+i+"]= ");
    a[i]=in.nextInt();
    }
    return a;
    }
    static void Print(int[] a)
    {
    for (int i = 0; i < a.length; ++i){ 
    System.out.print(a[i]+" ");
    }
    System.out.println();
    }
    static void LongestChain(int[] arr){
        int previous = arr[0];
        List<Integer> longestArr = new ArrayList<Integer>();
        List<Integer> currentArr = new ArrayList<Integer>();
        currentArr.add(previous);
        for(int i=1;i<arr.length;i++){
            if(arr[i]>previous){
                currentArr.add(arr[i]);
            }
            else {
                previous = arr[i];
                if(currentArr.size()>longestArr.size()){
                    longestArr =currentArr;
                }
                currentArr = new ArrayList<Integer>();
                currentArr.add(arr[i]);    
            }
        }
        if(currentArr.size()>longestArr.size()){
            longestArr = currentArr;
        }
        System.out.println("The longest chain of numbers in ascending order : ");
       System.out.print(longestArr);

    }
    public static void main(String[] args) {
    in = new Scanner(System.in);
     int[] myArray = Input();
    //int[] myArray = new int[]{4,2,5,8,10,1,5,10,11,15};
    System.out.println("Output array:");
    Print(myArray);
    LongestChain(myArray);
    in.close();
    }
    
}




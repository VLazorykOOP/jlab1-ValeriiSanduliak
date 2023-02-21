import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
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
    static void LongestChain(int[] myArray){

        ArrayList<Integer> current = new ArrayList<>();
        ArrayList<Integer> longestArr = new ArrayList<>();
        for(int i = 0; i < myArray.length; i++)
        {
            if(current.size() == 0)
            {
                current.add(myArray[i]);
            }
            else if(current.get(current.size() - 1) < myArray[i])
            {
                current.add(myArray[i]);
            }
            else
            {
                if(current.size() > longestArr.size())
                {
                    longestArr = current;
                    current = new ArrayList<>();
                    current.add(myArray[i]);
                }
                else
                {
                    current = new ArrayList<>();
                    current.add(myArray[i]);
                }
            }
        }
        if(current.size() > longestArr.size())
        {
            longestArr = current;
        }
        System.out.println("Longest chain " + Arrays.toString(longestArr.toArray()));

    }
    public static void main(String[] args) {
     in = new Scanner(System.in);
    // int[] myArray = Input();
    int[] myArray = new int[]{4,2,5,8,10,1,5,10,8,9};
    System.out.println("Output array:");
    Print(myArray);
    LongestChain(myArray);
    

    }
    
}




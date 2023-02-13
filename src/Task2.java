import java.util.Scanner;
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
    for (int i = 0; i < a.length; ++i) 
    System.out.print(a[i]+" ");
    System.out.println();
    }
    static void searchChain(int[] arr){
        Arrays.sort(arr); 
        int currentpos=1;
        int longchain =1;
        for(int i=1;i<arr.length;++i){
            if (arr[i] != arr[i-1]) {
                if (arr[i] == arr[i-1]+1) {
                   currentpos+=1;
                }
                else{
                    longchain = Math.max(longchain, currentpos);
                    currentpos = 1;
                }
            }
        }
        System.out.println("longest chain : "+ Math.max(longchain, currentpos) );
    }

    public static void main(String[] args) {
    in = new Scanner(System.in);
    int[] myArray = Input();
    System.out.println("Output array:");
    Print(myArray);
    searchChain(myArray);
    }
    
}

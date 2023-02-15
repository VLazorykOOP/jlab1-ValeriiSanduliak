import java.util.Scanner;
public class Task3 {
    static Scanner in;
    static int [][] Input (int n){
        int a[][] = new int[n][n];
        for (int i = 0; i < n; ++i)
        for (int j = 0; j < n; ++j)
        {
        System.out.print("["+i+","+j+"]= ");
        a[i][j]=in.nextInt();
        }
        return a;
        }
        static void Print(int[][] a){
            for (int i = 0; i < a.length; ++i, System.out.println() )
            for (int j = 0; j < a[i].length; ++j)
            System.out.print(a[i][j]+"\t");
            }
        static void Vect(int[][] a,int[][] b,int n){
            int[] x = new int [n];
            for (int i = 0; i < n; ++i){
            for (int j = 0; j < n; ++j){
                if(a[i][j]==b[j][i]){
                    x[i]=1;
                }
                else{
                    x[i]=0;
                }
            }
            }
            for(int i=0;i<n;++i){
                System.out.print("x["+i+"] "+x[i]+" ");
            }
        }    
    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.println("Input size : ");
        System.out.print("n = ");
       int  n=in.nextInt();
        while(n > 15 || n<=0){
            System.out.println("Incorrect value |" + n + '|');
            System.out.println("Enter n <=15 : ");
            n = in.nextInt();
    
        }
        System.out.println("Input A :");
        int[][] A=Input(n);
        System.out.println("Input B :");
        int[][] B=Input(n);
        System.out.println("Array A :");
        Print(A);
        System.out.println("Array B :");
        Print(B);
        Vect(A, B, n);
        }
}

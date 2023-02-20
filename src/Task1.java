import java.util.Scanner;
public class Task1 {  
    public static void main(String[] args) {

    System.out.println("1. Input double x,y ");
    System.out.print("Input x = ");
    Scanner in = new Scanner(System.in);
    double x = in.nextDouble();
    System.out.print("Input y = ");
    double y = in.nextDouble();
    System.out.println("Res(double) :" + ((1/(x*y))+(1/((x*x)+(y*y)))*(x-y))); 

    System.out.println("2. Input integer x,y ");
    System.out.print("Input x1 = ");
    int x1 = in.nextInt();
    System.out.print("Input y1 = ");
    int y1 = in.nextInt();
    System.out.println("Res(double) :" + (double)(1/(x1*y1))+(1/((x1*x1)+(y1*y1)))*(x1-y1)); 

    System.out.println("3. Input double out res integer ");
    System.out.print("Input x2 = ");
    double x2 = in.nextDouble();
    System.out.print("Input y2 = ");
    double y2 = in.nextDouble();
    System.out.println("Res(int) :" + (int)((1/(x2*y2))+(1/((x2*x2)+(y2*y2)))*(x2-y2))); 
     in.close();
    }

}
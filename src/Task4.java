import java.util.Scanner;
public class Task4 {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input text:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");

        for(int i=0;i<words.length;++i){
          String word = words[i];
          for(int j=0;j<word.length();++j){
            for(int k=j+1;k<word.length();k++)
             if(word.charAt(j)==word.charAt(k)){
              words[i]="";
            }
          }
        }
        System.out.println("String after remove word : ");
        for(int i=0;i<words.length;++i){
          System.out.print(words[i]+" ");
        }

        




         in.close(); 
        } 

}

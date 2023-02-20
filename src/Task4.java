import java.util.Scanner;
import java.util.Arrays;
public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input text:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;-?!]+");
        
        int indexw = 0;
        String[] result = new String[words.length];
        for(int i=0;i<words.length;++i){
          boolean hasDuplicate = false;
          String word = words[i];
          for(int j=0;j<word.length();++j){
                for(int k=j+1;k<word.length();k++){
                 if(word.charAt(j)==word.charAt(k)){
                  hasDuplicate = true;
                  break;
                }
              }
              if(hasDuplicate) break;
            }
        if(!hasDuplicate){
          result[indexw] = word;
          indexw++;
          //System.out.print(word + " ");
        }
        }
         System.out.println("String after remove word : ");
         result = Arrays.copyOfRange(result, 0, indexw);
         System.out.print(Arrays.toString(result));
         in.close(); 
    } 
}
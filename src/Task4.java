import java.util.Scanner;
import java.util.Arrays;
public class Task4 {
    static int count (String[] s){
        int count = 0, i;
        for(i=0; i<s.length;i++){
            if(s[i]!="")count++;
        }
        return count;
    }
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
        int j=0;
        String[] result = new String[count(words)];
        for(int i=0; i<words.length; i++){
        if(words[i]!=""){
          result[j]=words[i];
          j++; 
        }
        }
        System.out.println("String after remove word : ");
        System.out.println(Arrays.toString(result));
         in.close(); 
    } 
}

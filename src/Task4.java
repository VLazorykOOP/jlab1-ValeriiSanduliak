import java.util.Scanner;
public class Task4 {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String text = "Hello,word my name. is valera.";
      //  System.out.println("Input text:");
      //String text = in.nextLine();
      char[] char_txt = text.toCharArray();
      int start = 0;
      int end = 0;
      int writePos = 0;
      System.out.println("String before remove:");
      System.out.println(text);

      for (int readPos = 0; readPos < char_txt.length; readPos++) {
          if (char_txt[readPos] == ' ' || char_txt[readPos] == ',' || char_txt[readPos] == '.') {
              end = readPos - 1;
              if (!hasDuplicateLetters(char_txt, start, end)) {
                  for (int i = start; i <= end; i++) {
                      char_txt[writePos] = char_txt[i];
                      writePos++;
                  }
              }
              char_txt[writePos] = char_txt[readPos];
              writePos++;
              start = readPos + 1;
          } else if (readPos == char_txt.length - 1) {
              end = readPos;
              if (!hasDuplicateLetters(char_txt, start, end)) {
                  for (int i = start; i <= end; i++) {
                      char_txt[writePos] = char_txt[i];
                      writePos++;
                  }
              }
          }
      }
      System.out.println("String after remove:");
      String result = new String(char_txt, 0, writePos);
      System.out.println(result);
      in.close();
  }

  static boolean hasDuplicateLetters(char[] chars, int start, int end) {
      int[] frequency = new int[256];
      for (int i = start; i <= end; i++) {
          char c = chars[i];
          if (frequency[c] > 0) {
           
            return true;
          }
          frequency[c]++; 
      }
      return false;
  }
}

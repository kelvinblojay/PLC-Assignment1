import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


 
public class Analyzer {
   // Main function
   public static void main(String[] args) throws IOException {
        
       BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        
       String str = reader.readLine();
        
       String sChar=" !#$%&'()*+,-./:;<=>?@[]^_`{|}";
	   
       while(str != null) {
           // Split the string with space
           String[] split = str.split(" ");
           // loop through each string
           for(int i = 0 ; i < split.length ; i++) {
               String lexeme = split[i];
               int count = 0;
               while(count < lexeme.length()) {
                   
                   if(sChar.contains(Character.toString(lexeme.charAt(count)))) {
                       if(!sChar.contains(Character.toString(lexeme.charAt(count-1)))){
                           System.out.println();
                       }
                       
                       System.out.println(lexeme.charAt(count));//print newline if string contains special char
                   }
                   else {
                        
                       System.out.print(lexeme.charAt(count));

                   }
                   count++;

               }
               System.out.println();

           }

           str = reader.readLine();

       }

   }

}
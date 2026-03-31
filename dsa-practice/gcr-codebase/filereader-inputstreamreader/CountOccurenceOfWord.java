import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountOccurenceOfWord{

    public static void main(String[] args) {

        String filePath = "sample.txt";

        try(BufferedReader fr = new BufferedReader(new FileReader(filePath))){
        
            int count = 0;
            String word = "file";
            String line;
            while((line = fr.readLine() )!= null ){

                String[] arr = line.split("\\W+");
                // W for Remove punctuation while splitting by using non-word characters:
                // This treats . , ! etc. as separators.

                for(int i = 0 ; i < arr.length ; i++){
                    if (arr[i].equalsIgnoreCase(word)) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q8 {
    public static void main(String[] args) {
        String sourceFilePath = "C:\\Users\\HP\\Desktop\\input.txt";
        String destinationFilePath = "C:\\Users\\HP\\Desktop\\dest.txt";
        String wordToReplace = "tassadaq";          // Specify the word to replace
        String replacementWord = "usmara";        // Specify the replacement word

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFilePath))) {

            String line;

            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replaceAll(wordToReplace, replacementWord);

                writer.write(modifiedLine);
                writer.newLine();
            }

            System.out.println("Word replaced and content saved successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class q6 {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\HP\\Desktop\\input.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int wordCount = 0;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
                System.out.println(line);
            }

            System.out.println("Total words in the file: " + wordCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

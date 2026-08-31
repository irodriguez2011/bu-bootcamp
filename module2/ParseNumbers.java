import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ParseNumbers {
    public static void main(String[] args) {
        String filePath = "numbers.txt"; // Path to the text file containing numbers

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    System.out.println("Parsed number: " + number);
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }


    }
}

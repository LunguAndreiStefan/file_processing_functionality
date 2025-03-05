import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {
        String filePath = "input.txt";
        String content = readFile(filePath);
        System.out.println("Original content:");
        System.out.println(content);

        content = removePunctuation(content);
        System.out.println("\nAfter removing punctuation:");
        System.out.println(content);

        content = removeXtraSpace(content);
        System.out.println("\nAfter removing extra spaces:");
        System.out.println(content);
    }

    public static String readFile(String filePath)
    {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public static String removePunctuation(String text)
    {
        return text.replaceAll("[^a-zA-Z\\s]", "");//replace everything that is not('^'){a-z A-Z \s(orice spatiu)}
    }

    public static String removeXtraSpace(String text)
    {
        return text.replaceAll("\\s+"," ");// /s+ mai multe spatii (se pare)
    }

}
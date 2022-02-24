import java.io.BufferedReader;
import java.io.FileReader;

public class exp24count {
    public static void main(String[] args) throws Exception {
        String line;
        int count = 0;
        int c = 0, l = 0;
        // Opens a file in read mode
        FileReader file = new FileReader("TestFile3.txt");

        while (file.read() != -1)
            c++;
        file.close();
        FileReader f = new FileReader("TestFile3.txt");
        BufferedReader br = new BufferedReader(f);
        // Gets each line till end of file is reached
        while ((line = br.readLine()) != null) {
            // Splits each line into words

            l++;
            String words[] = line.split(" ");
            // Counts each word
            count = count + words.length;

        }

        System.out.println("Number of words present in given file: " + count);
        System.out.println("Number of lines present in given file: " + l);
        System.out.println("Number of characters present in given file: " + c);
        br.close();
    }
}

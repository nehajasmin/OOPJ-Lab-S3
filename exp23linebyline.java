import java.io.*;

public class exp23linebyline {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("TestFile3.txt"));
        String s = br.readLine();
        int i = 1;
        while (s != null) {
            System.out.println((i++) + ". " + s);
            s = br.readLine();
        }
        br.close();
    }
}
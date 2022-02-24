import java.io.*;

public class exp21filehandling1 {
    public static void main(String args[]) throws IOException {
        try {
            FileInputStream fin = new FileInputStream("TestFile1.txt");
            System.out.println("File 1 opened");

            FileOutputStream fout = new FileOutputStream("TestFile2.txt");
            System.out.println("File 2 opened");

            int s = fin.read();
            while (s != -1) {
                fout.write(s);
                s = fin.read();
            }
            fin.close();
            fout.close();
            System.out.println("File data copied and file objects closed");
        } catch (FileNotFoundException fne) {
            System.out.println(fne);
        }

    }
}

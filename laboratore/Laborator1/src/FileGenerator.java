import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;

public class FileGenerator {
    public static void main(String[] args) {
        try {
            PrintStream w1 = new PrintStream(new File("rand100.txt"));
            PrintStream w2 = new PrintStream(new File("rand500.txt"));
            PrintStream w3 = new PrintStream(new File("rand1000.txt"));
            PrintStream w4 = new PrintStream(new File("rand5000.txt"));
            PrintStream w5 = new PrintStream(new File("rand10000.txt"));

            Random r = new Random();

            gjeneroFile(w1, 100, r);
            gjeneroFile(w2, 500, r);
            gjeneroFile(w3, 1000, r);
            gjeneroFile(w4, 5000, r);
            gjeneroFile(w5, 10000, r);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static void gjeneroFile(PrintStream writer, int size, Random r){
        for (int i = 0; i < size; i++) {
            writer.println(r.nextInt());
        }
        writer.close();
    }
}

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) throws Exception {
        FileReader f = new FileReader("src1/a.txt");
        int i;
        while ((i=f.read())!=-1) {
            System.out.print((char) i);
        }
        f.close();
    }
}

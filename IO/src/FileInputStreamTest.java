import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream f = null;
        try {
            f = new FileInputStream("src1/a.txt");
            //int i = f.read();// read one character
            //System.out.print((char) i);

            //read entire file
            int j=0;
            while ((j=f.read())!=-1) { //read byte from the stream and store in j, j=-1 mean that end of file
                System.out.print((char) j);
            }
            f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        finally {
            f.close();
        }
    }
}

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputStreamTest {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("src1/a.txt");
        BufferedInputStream b = new BufferedInputStream(f);// attach file from FileInputStream

        //number of byte that can be read without blocking
        System.out.println(b.available());

        if (b.markSupported())  //check if input stream support mark and reset method
            b.mark(b.available());

        //skip n bytes
        b.skip(4);
        int i;
        while ((i=b.read())!=-1) {
            System.out.print((char) i);
        }
        //b.mark(b.available());
        b.reset();
        while ((i=b.read())!=-1) {
            System.out.print((char) i);
        }

        f.close();
    }
}

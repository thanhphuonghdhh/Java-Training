import javax.imageio.IIOException;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream2 {
    public static void main(String[] args) throws IIOException {
        // file contains 3 chars 'a', 'b', and 'c'
        try (FileInputStream fileInputStream = new FileInputStream("src/a.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

            System.out.println((char) bufferedInputStream.read()); // prints a
            bufferedInputStream.mark(2);   // place mark at second byte
            System.out.println((char) bufferedInputStream.read()); // prints b
            System.out.println((char) bufferedInputStream.read()); // prints c
            System.out.println(bufferedInputStream.read()); // prints -1

            bufferedInputStream.reset();    // meaning start again from where I placed the mark
            System.out.println((char) bufferedInputStream.read()); // prints b
            System.out.println((char) bufferedInputStream.read()); // prints c
            System.out.println( bufferedInputStream.read()); // prints -1

            bufferedInputStream.reset();
            int i=0;
            while ((i=bufferedInputStream.read())!=-1) {
                System.out.println((char) i);
            }
        } catch (IOException ie) { ie.printStackTrace();}
    }
}

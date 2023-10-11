import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) throws Exception{
        FileWriter f = new FileWriter("src1/c.txt");
        f.write("Hello You");
        f.close();
    }
}

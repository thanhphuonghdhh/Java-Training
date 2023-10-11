import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryTest {
    public static void main(String[] args) {
        String dir = "src1/src";

        /*
        // Java NIO
        Path path = Paths.get(dir);
        try {
            Files.createDirectory(path);//createDirectories will create parent directory in case it do not exist before
            System.out.println("Directory is created!");
        } catch (IOException e) {
            System.err.println("Failed to create directory!" + e);
        }
         */

        //Java IO
        File file = new File(dir);
        if (file.mkdirs()) {
            System.out.println("Y");
        }
        else System.out.println("N");


    }
}

import java.io.*;

public class FileOutputStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream f=null;
        BufferedOutputStream b=null;
        try {
            File log = new File("src1/b.txt");
            //f = new FileOutputStream("src1/b.txt");
            FileWriter fileWriter = new FileWriter(log,true);
            //b = new BufferedOutputStream(f);
            BufferedWriter b1 = new BufferedWriter(fileWriter);
            //f.write(66);
            String s = "Hello My Friend 2";
            //byte[] bytes=s.getBytes();
            //f.write(bytes);
            //b.write(bytes);
            //b.write(bytes,0,2);
            b1.write(s);
            b1.flush();
            //b.flush();//clean buffer output stream
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            //f.close();
            //b.close();
        }
    }
}

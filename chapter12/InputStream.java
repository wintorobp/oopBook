import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException{
        // setup file and stream
        File inFile = new File("Sample1.data");
        FileInputStream inStream = new FileInputStream(inFile);

        // set up an array to read data in
        int fileSize = (int) inFile.length();
        byte[] byteArray = new byte[fileSize];

        // read data in and display them
        inStream.read(byteArray);
        for (int i = 0; i < fileSize; i++) {
            System.out.println(byteArray[i]);
        }

        // input done, close the stream
        inStream.close();
    }
}
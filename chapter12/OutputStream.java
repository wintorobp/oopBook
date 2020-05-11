import java.io.*;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        // set up file and stream
        File outFile = new File("sample.data");
        FileOutputStream outStream = new FileOutputStream(outFile);
        
        // data to output
        byte[] byteArray = {10,20,30,40,50,60,70,80};

        // write data to stream
        outStream.write(byteArray);

        // output done so close the stream
        outStream.close();

    }
}
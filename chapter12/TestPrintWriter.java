import java.io.*;

public class TestPrintWriter {
    public static void main(String[] args) throws IOException {
        // setup file and stream
        File outFile = new File("sample3.data");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        PrintWriter outStream = new PrintWriter(outFileStream);

        // write values of primitives data types
        outStream.println(987654321);
        outStream.println('P');
        outStream.println(22F);
        outStream.println(33D);
        outStream.println(true);

        outStream.close();
    }
}
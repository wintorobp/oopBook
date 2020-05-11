import java.io.*;

public class DataOutputStream {
    public static void main(String[] args) throws IOException{
        // set up the streams
        File outFile = new File("Sample2.data");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        DataOutputStream outDataStream = new DataOutputStream(outFileStream);


    }
}
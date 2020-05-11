import java.io.*;
import java.io.DataOutputStream;
public class TestDataOutputStrem {
    public static void main(String[] args) throws IOException{
        // set up the streams
        File outFile = new File("Sample2.data");
        FileOutputStream outFileStream = new FileOutputStream(outFile);
        DataOutputStream outDataStream = new DataOutputStream(outFileStream);
        
        // write values of primitives data types to the stream
        outDataStream.writeInt(987654321);
        outDataStream.writeLong(11111111L);
        outDataStream.writeFloat(22222222F);
        outDataStream.writeDouble(3333337);
        outDataStream.writeChar('A');
        outDataStream.writeBoolean(true);

        // close the stream
        outDataStream.close();

        // output done, close stream
        outDataStream.close();

    }
}
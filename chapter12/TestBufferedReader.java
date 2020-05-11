import java.io.*;

public class TestBufferedReader {
    public static void main(String[] args) throws IOException{
        File inFile = new File("sample3.data");
        FileReader fileReader = new FileReader(inFile);
        BufferedReader bufReader = new BufferedReader(fileReader);
        String str;

        // get integer
        str = bufReader.readLine();
        int i = Integer.parseInt(str);

        // get long
        str = bufReader.readLine();
        long l = Long.parseLong(str);

        str = bufReader.readLine();
        float f= Float.parseFloat(str);

        //getDouble
        str = bufReader.readLine();
        double d = Double.parseDouble(str);

        //getchar
        str = bufReader.readLine();
        char c = str.charAt(0);

        

        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);

        bufReader.close();
    }
}
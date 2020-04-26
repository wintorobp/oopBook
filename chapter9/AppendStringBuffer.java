
public class AppendStringBuffer {
    public static void main(String[] args) {
        int i = 3;
        StringBuffer buffer = new StringBuffer("");

        System.out.println(buffer.append("oke"));
        System.out.println(buffer.append(i));
        
        System.out.println(buffer.insert(2, "'asy'"));
    }
}
import java.util.Scanner;

public class ChangeStringToX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer bufferTemp;
        String str1;

        int index,pjgKarakter;
        char huruf,kapital;

        System.out.println("masukkan String : ");
        str1 = scanner.next();

        bufferTemp = new StringBuffer(str1);
        pjgKarakter = str1.length();

        for (index = 0; index < pjgKarakter; index++) {
            huruf = bufferTemp.charAt(index);
            if (huruf =='a'|| huruf =='A'||
                huruf =='i'|| huruf =='I'||
                huruf =='u'|| huruf =='U'||
                huruf =='e'|| huruf =='E'||
                huruf =='o'|| huruf =='O'
                ) {
                bufferTemp.setCharAt(index, 'X');
            } 
        }

        System.out.println(str1);
        System.out.println(bufferTemp);


        
    }
}
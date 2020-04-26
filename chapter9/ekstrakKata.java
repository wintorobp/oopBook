import java.util.Scanner;

public class ekstrakKata {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));

        String kalimat;
        char kosong = ' ';
        int index,pjgKalimat,beginIndex,endIndex;

        index =0;
        pjgKalimat=0;
        beginIndex=0;
        endIndex=0;
        

        System.out.println("masukkan kalimat : ");
        kalimat = scanner.next();
        pjgKalimat = kalimat.length();

        System.out.println("kalimat yg anda masukkan : "+kalimat);
        System.out.println("hasil ekstrak");
        while (index < pjgKalimat) {
            while (index < pjgKalimat && kalimat.charAt(index) == kosong) {
                index++;
                beginIndex = index;
            }
            while (index < pjgKalimat && kalimat.charAt(index) != kosong) {
                index++;
                
                }
                endIndex = index;
                if (beginIndex!=endIndex) {
                    System.out.println(kalimat.substring(beginIndex, endIndex));
                
                
            }
            
            
        }
        
            //

       

    }
}
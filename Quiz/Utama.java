import java.util.*;
public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        String nama,npm,jenisKelamin;
        int jml,usia;
        usia = 0;
        char kelamin;
        Mahasiswa[] mhs;
        System.out.println("========================================");
        System.out.println("========  INPUT DATA MAHASISWA  ========");
        System.out.println("========================================");
        System.out.print("jumlah Mahasiswa yg ingin diinputkan: ");
        jml = scanner.nextInt();
        mhs = new Mahasiswa[jml];

        for (int i = 0; i < mhs.length; i++) {
            System.out.print("\nnama : ");
            nama = scanner.next();
            while (true) {
                System.out.print("npm : ");
                npm = scanner.next();
                if (npm.matches("[1][6-8][0-9]{8}")) {
                    break;
                }else{
                    System.out.println("\nWARNING : npm tidak sesuai format!!!!");
                }
            }

            boolean cek=true;
            while (cek) {
                System.out.print("usia : ");
                try {
                    usia = scanner.nextInt();
                    if (usia < 0) {
                        throw new Exception("Usia tidak boleh Minus");
                    }
                    cek =false;
                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("Warning : Masukkan Nilai Integer!!!");
                }catch(Exception e){
                    System.out.println("Error : "+e);
                }
            }
            
            
            
            while (true) {
                System.out.print("jens kelamin(L/P) : ");
                jenisKelamin = scanner.next();
                kelamin = jenisKelamin.charAt(0);
                if (kelamin == 'L'||
                    kelamin == 'l'||
                    kelamin == 'P'||
                    kelamin == 'p') {
                    break;
                }else{
                    System.out.println("WARNING : jenis kelamin salah");
                }
            }
            
            
            
            mhs[i] = new Mahasiswa();
            mhs[i].setName(nama);
            mhs[i].setNpm(npm);
            mhs[i].setGender(kelamin);
            mhs[i].setUsia(usia);
        }

        
        System.out.format("\n%20s%12s%4s%5s%10s", "Nama", "NPM", "L/P","Usia", "Nama PT");
        System.out.println("");
            for (int i = 0; i < mhs.length; i++) {
                System.out.format("%20s",mhs[i].getName());
                System.out.format("%12s",mhs[i].getNpm());
                System.out.format("%4s",mhs[i].getGender());
                System.out.format("%5s",mhs[i].getUsia());
                System.out.format("%10s",mhs[i].kampus);
                System.out.println("");
            }
        
        
        
        

        
    }
}
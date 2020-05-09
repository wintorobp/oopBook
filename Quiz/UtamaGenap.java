import java.util.*;

public class UtamaGenap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.getProperty("line.separator"));
        String nama, nidn, jenisKelamin;
        int jml, usia;
        int usiaDosen = 0;
        char kelamin;
        Dosen[] dosen;
        System.out.println("========================================");
        System.out.println("========  INPUT DATA DOSEN  ========");
        System.out.println("========================================");
        System.out.print("jumlah Data Dosen yg ingin diinputkan: ");
        jml = scanner.nextInt();
        dosen = new Dosen[jml];

        for (int i = 0; i < dosen.length; i++) {
            System.out.print("\nnama : ");
            nama = scanner.next();
            while (true) {
                System.out.print("nidn : ");
                nidn = scanner.next();
                if (nidn.matches("[0-9]{10}")) {
                    break;
                } else {
                    System.out.println("\nWARNING : npm tidak sesuai format!!!!");
                }
            }

            boolean cek = true;
            while (cek) {
                System.out.print("usia : ");
                try {
                    usia = scanner.nextInt();
                    if (usia < 0) {
                        throw new Exception("Usia tidak boleh minus");
                    }
                    cek = false;
                } catch (InputMismatchException e) {
                    scanner.next();
                    System.out.println("Invalid Entry");
                } catch (Exception e) {
                    System.out.println("Error :" + e);
                }

            }

            while (true) {
                System.out.print("jens kelamin(L/P) : ");
                jenisKelamin = scanner.next();
                kelamin = jenisKelamin.charAt(0);
                if (kelamin == 'L' || kelamin == 'l' || kelamin == 'P' || kelamin == 'p') {
                    break;
                } else {
                    System.out.println("WARNING : jenis kelamin salah");
                }
            }

            dosen[i] = new Dosen();
            dosen[i].setName(nama);
            dosen[i].setNidn(nidn);
            dosen[i].setGender(kelamin);
            // dosen[i].setUsia(usia);
        }

        System.out.format("\n%20s%12s%4s%5s%10s", "Nama", "NIDN", "L/P", "Usia", "Nama PT");
        System.out.println("");
        for (int i = 0; i < dosen.length; i++) {
            System.out.format("%20s", dosen[i].getName());
            System.out.format("%12s", dosen[i].getNidn());
            System.out.format("%4s", dosen[i].getGender());
            // System.out.format("%5s",dosen[i].getUsia());
            System.out.format("%10s", dosen[i].homebase);
            System.out.println("");
        }
    }
}
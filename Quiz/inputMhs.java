public class inputMhs {
    //data member
    String nama,npm,jenisKelamin;
    int jml;
    char kelamin;
    Mahasiswa[] mhs;
    
    public inputMhs(){
        System.out.print("jumlah Mahasiswa yg ingin diinputkan: ");
        jml = scanner.nextInt();
        mhs = new Mahasiswa[jml];

        for (int i = 0; i < mhs.length; i++) {
            System.out.print("\nnama : ");
            nama = scanner.next();
            while (true) {
                System.out.print("npm : ");
                npm = scanner.next();
                if (npm.matches("[1][6-8][1,5][5][0][6][1][0][0-5][0-9]")) {
                    break;
                }else{
                    System.out.println("\nWARNING : npm tidak sesuai format!!!!");
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
        }
    }
        
}
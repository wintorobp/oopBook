public class Mahasiswa {
    //data member
    private static final String namaPT = "UNILA";
    private String name,npm;
    private int usia;
    private char gender;
    String kampus;

    // default constructor
    public Mahasiswa(){
        this.name = null;
        this.npm = null;   //:1815061004
        this.gender = 'U'; 
        this.usia = 0;  
        this.kampus = namaPT;
        
    }
    // constructor dengan argumen
    // 1. name
    // 2. npm
    // 3. gender
    // 4. usia
    // 5. kampus
    public Mahasiswa(String name, int usia,char gender,String namaPT){
        this.name = name;
        this.npm = npm;
        this.gender = gender;
        this.usia = usia;
        this.kampus = namaPT;
    }

    //getter
    public String getName(){
        return name;
    }
    public String getNpm(){
        return npm;
    }
    public char getGender(){
        return gender;
    }
    public int getUsia(){
        return usia;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setNpm(String npm){
        this.npm = npm;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setUsia(int usia){
        this.usia = usia;
    }
}
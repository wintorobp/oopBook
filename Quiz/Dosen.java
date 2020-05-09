import java.util.*;

public class Dosen {
    private static final String namaPT = "UNILA";
    private static final String DEFAULT_MESSAGE = "Usia : ";
    private String nama, nidn;
    private Scanner scanner;
    private int usia;
    private char gender;
    String homebase;

    // default constructor
    public Dosen() {
        scanner = new Scanner(System.in);
        this.nama = null;
        this.nidn = null;
        this.gender = 'u';
        this.usia = 0;
        this.homebase = namaPT;
    }

    public Dosen(String nama, String nidn, String nip, char gender, int usia) {
        this.nama = nama;
        this.nidn = nidn;
        this.gender = gender;
        this.usia = usia;
    }

    // getter
    public String getName() {
        return nama;
    }

    public String getNidn() {
        return nidn;
    }

    public char getGender() {
        return gender;
    }

    public int getUsia(){
        return usia;
    }

    // setter
    public void setName(String nama) {
        this.nama = nama;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }
}
public class MataKuliah {
    private static final String namaPT = "Universitas Lampung";
    private String kodeMK, namaMK, jenisMK;
    int sks, semester;
    

    public MataKuliah(){
        this.kodeMK = "000000";
        this.namaMK = "NotSet";
        this.sks = 0;
        this.semester = 0;
        this.jenisMK = "xxx";

    }

    //getter
    public String getKodeMK(){
        return kodeMK;;
    }
    public String getNamaMK(){
        return namaMK;
    }
    public int getSKS(){
        return sks;
    }
    public int getSemester(){
        return semester;
    }
    public String getJK(){
        return jenisMK;
    }

    //setter
    public void setKodeMK(String kodeMK){
        this.kodeMK = kodeMK;
    }
    public void setNamaMK(String namaMK){
        this.namaMK = namaMK;
    }
    public void setSKS(){
        this.sks = sks;
    }
    public void setSemester(int semester){
        this.semester = semester;
    }
    public void setJenisMK(String jenisMK){
        this.jenisMK = jenisMK;
    }
}
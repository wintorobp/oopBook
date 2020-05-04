import java.util.*;
public class arraysObject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama, jKelamin,namaDicari;
        int usia,totalUsia,rataUsia;
        totalUsia=0;
        rataUsia=0;
        char jKel;
        

        Person[] person;
        person = new Person[3];
        
        for (int i = 0; i < person.length; i++) {
            System.out.println("orang ke-"+(i+1));
            System.out.print("Nama : ");
            nama = scanner.next();
            System.out.print("Usia : ");
            usia = scanner.nextInt();
            System.out.print("Gender(M/F) : ");
            jKelamin = scanner.next();
            jKel = jKelamin.charAt(0);
            
            person[i] = new Person();
            person[i].setName(nama);
            person[i].setAge(usia);
            person[i].setGender(jKel);
            
        }
        System.out.println("\nDaftar Anggota");
        System.out.format("%10s%5s%4s","Nama","Usia", "M/F" );
        System.out.println();
        for (int i = 0; i < person.length; i++) {
            totalUsia += person[i].getAge();
            
            
            System.out.format("%10s", person[i].getName());
            System.out.format("%5d",person[i].getAge());
            System.out.format("%4s",person[i].getGender()+"\n");

            
        }
        rataUsia = totalUsia/(person.length);
        System.out.println("\ntotal usia : "+totalUsia);
        System.out.println("rata usia : "+rataUsia);

        Person termuda,tertua;

        termuda = tertua = person[0];
        
        for (int i = 1; i < person.length; i++) {
            if (person[i].getAge() < termuda.getAge()) {
                termuda = person[i];
            }else if(person[i].getAge() > tertua.getAge()){
                tertua = person[i];
            }
        }
        System.out.println("usia termuda : "+termuda.getAge());
        System.out.println("yang termuda bernama : "+termuda.getName());
        System.out.println("usia tertua : "+tertua.getAge());
        System.out.println("yang tertua bernama : "+tertua.getName());

        System.out.println("cari orang : ");
        namaDicari = scanner.next();
        
        int i=0;
        while (i<person.length && !person[i].getName().equalsIgnoreCase(namaDicari)) {
            i++;
        }
        if (i == person.length) {
            System.out.println(namaDicari + " tidak ada di dalam array");
        }else{
            System.out.println(namaDicari + "ada di indeks ke-"+i);
        }
        

        scanner.close();
    }
    
}
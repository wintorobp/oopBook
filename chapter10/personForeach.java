import java.util.*;
public class personForeach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama;
        Person[] person = new Person[3];

        for (int i = 0; i < person.length; i++) {
            System.out.print("nama : ");
            nama = scanner.next();

            person[i]=new Person();
            person[i].setName(nama);
        }

        for (Person p : person) {
            System.out.println(p.getName());
        }


        scanner.close();
        

    }
}
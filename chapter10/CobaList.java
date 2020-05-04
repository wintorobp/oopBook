import java.util.*;
public class CobaList {
    public static void main(String[] args) {
        List<Person> friends = new ArrayList<Person>();
        Person person;
    
        person = new Person("Puput",10,'F');
        friends.add(person);    
    
        person = new Person("Budi",12,'M');
        friends.add(person);
    
        person = new Person("Wintoro",14,'F');
        friends.add(person);

        System.out.println(friends.size());
        System.out.println(friends.get(2).getName());

        for (Person p : friends) {
            System.out.println(p.getName());
        }

        // menampilkan yg usianya diatas 10
        System.out.println("\nusia diatas 10 : ");
        for (Person p : friends) {
            if (p.getAge() > 10) {
                System.out.println(p.getName());
            }
        }

        List<Person> lebih10Tahun = new ArrayList<Person>();
        for (Person p : friends) {
            if (p.getAge() > 10){
                lebih10Tahun.add(p);
            }
        }

        // OlderThan10
        System.out.println("\nOlder Than 10");
        for (Person person2 : lebih10Tahun) {
            System.out.println(person2.getName());
        }
        
    }
}
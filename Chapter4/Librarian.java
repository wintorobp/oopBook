
public class Librarian {
    public static void main(String[] args) {
        Student student;
        LibraryCard card1, card2;

        student = new Student();
        student.setName("Kanaya");
        student.setEmail("kanaya@gmail.com");

        card1 = new LibraryCard();
        card1.setOwner(student);
        card1.checkOut(3);

        card2 = new LibraryCard();
        card2.setOwner(student);

        System.out.println("Card1 info : ");
        System.out.println(card1.toString() + "\n");
        
        System.out.println("Card2 info : ");
        System.out.println(card2.toString() + "\n");
    }
}
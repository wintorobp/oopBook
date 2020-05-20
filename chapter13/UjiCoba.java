public class UjiCoba {
    public static void main(String[] args) {
        Pet rept = new Reptile();

        System.out.println(rept.speak());
        rept.setName("poet");
        System.out.println(rept.getName());
    }
}
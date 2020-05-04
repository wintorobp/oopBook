public class foreach {
    public static void main(String[] args) {

        int[] number;
        number = new int[3];
        number[0] = 3;
        number[1] = 4;
        number[2] = 5;

        int sum;
        sum=0;


        // for (int i = 0; i < number.length; i++) {
        //     sum += number[i];
        // }
        // System.out.println("jumlah number : "+sum);

        for (int nilai : number) {
            sum += nilai;
        }
        System.out.println("total : "+ sum);
    }
}
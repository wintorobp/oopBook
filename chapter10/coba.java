public class coba {
    public static void main(String[] args) {
        int[][] table = new int[10][10];

        maxVal = table[0][0];


        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] > maxVal) {
                    maxVal = table[i][j];
                }
            }
        }
        System.out.println("maxVal : "+maxVal);
    }
    

    




}
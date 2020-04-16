
public class Ch6CarpetPriceTableWithFormat {
    public static void main(String[] args) {
        int price;

        // cetak ;label kolom
        System.out.print("   "); // 3 blank space

        for(int colLabel = 5; colLabel <=25; colLabel+=5){
            System.out.format("%8d", colLabel);
        }
        System.out.println("");
        System.out.println("");

        // cetak baris harga
        for (int width=5;width<=14; width++){
            System.out.format("%3d", width);

            for(int length=5; length<=25; length+=5){
                price = width * length * 15;
                System.out.format("%8d", price);
            }
            // finished one row; now move on the next row
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }
}
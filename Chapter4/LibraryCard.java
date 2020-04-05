
public class LibraryCard {
    private Student owner;
    private int borrowCnt;
    // constructor
    public LibraryCard(){
        owner = null;
        borrowCnt = 0;
    }

    //menghitunng jumlah seluruh buku yg dipinjam
    public void checkOut(int numOfBooks){
        borrowCnt = borrowCnt + numOfBooks;
    }

    // memanggil jumlah buku yg dipinjam
    public int getNumberOfBooks(){
        return borrowCnt;
    }

    // memanggil nama pemilik kartu
    public String getOwnerName(){
        return owner.getName();
    }

    // mengeset nama pemilik kartu 
    public void setOwner(Student student){
        owner =student;
    }
    // tampilkan keterangan kartu
    public String toString(){
        return  "owner name     : " + owner.getName() + "\n" +
                "      email    : " + owner.getEmail() + "\n" +
                "Books Borrowed : " + borrowCnt;
    }
}
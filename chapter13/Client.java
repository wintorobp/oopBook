import one.*;
import two.*;

public class Client {
    public void test(){
        Super   mySuper = new Super();
        Sub     mySub   = new Sub();

        int i = mySuper.public_Super_Field;
        int j = mySub.public_Sub_Field;
        int k = mySub.public_Super_Field;
    }
}
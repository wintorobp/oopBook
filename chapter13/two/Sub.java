package two;
import one.*;

public class Sub extends Super{
    public int public_Sub_Field;
    protected int protected_Sub_Field;
    private int private_Sub_Field;

    public Sub(){
        public_Sub_Field = 1000;
        protected_Sub_Field = 2000;
        private_Sub_Field = 3000;
    }

}
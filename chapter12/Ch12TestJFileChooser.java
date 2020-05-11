import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Ch12TestJFileChooser {
    public static void main(String[] args) throws IOException{
        JFileChooser chooser;
        File file, directory;
        int status;
        
        chooser = new JFileChooser();
        status = chooser.showOpenDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();
            System.out.println("Directory : "+ directory.getName());
            System.out.println("File selected to open : "+file.getName());
            System.out.println("Full path name : "+ file.getAbsolutePath());
        }else{
            System.out.println("Open file dialog canceled");
        }

        System.out.println("\n\n");
        status = chooser.showSaveDialog(null);

        if (status == JFileChooser.APPROVE_OPTION) {
            file = chooser.getSelectedFile();
            directory = chooser.getCurrentDirectory();  

            System.out.println("Directory : "+directory.getName());
            System.out.println("File selected for saving data : "+file.getName());
            System.out.println("Full path name : "+ file.getAbsolutePath());
        }else{
            System.out.println("Save File Dialog Canceled   ");
        }
    }
}
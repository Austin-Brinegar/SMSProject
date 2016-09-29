import java.io.File;
import java.io.IOException;
/**
 * Created by Austin on 9/28/2016.
 */
public class ExecuteCommand {
    public static void main(String[] args) throws IOException {
        String appName = "Chrome";
        String path = "C:\\Users\\Austin\\Desktop\\quicklaunch apps\\"+appName +".lnk";
        File file = new File(path);
        if (!file.exists()) {
            throw new IllegalArgumentException("The file " + path + " does not exist");
        }
        Process p = Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + file.getAbsolutePath());
    }
}
package snippets;

import lombok.Data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

@Data
public class CopyFile {
    private int i;
    private FileInputStream fileInputStream;
    private FileOutputStream fileOutputStream;

    public void CopyFileData(String from, String to) {

        if (from.isEmpty() || to.isEmpty()) {
            System.out.println("No file name provided");
            return;
        }

        try {
            fileInputStream = new FileInputStream(from);
            fileOutputStream = new FileOutputStream(to);

            do {
                i = fileInputStream.read();
                if (i != -1) {
                    fileOutputStream.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

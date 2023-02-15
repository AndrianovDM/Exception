package Homework3.data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {

    Data data = new Data();

    public void writeInFile(FileWriter fw, String[] strArr ) {
        try {
            fw.write("<" + data.getSurname(strArr) + ">" +
                    "<" + data.getName(strArr) + ">" +
                    "<" + data.getPatronymics(strArr) + ">" +
                    "<" + data.getTelephoneNumber(strArr) + ">" +
                    "<" + data.getGender(strArr) + ">");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public void createFile(String[] strArr) {
        try {
            File file = new File(data.getSurname(strArr) + ".txt");
            if (file.exists()) {
                FileWriter fw = new FileWriter(file, true);
                fw.append('\n');
                writeInFile(fw, strArr);
            }
            else {
                FileWriter fw = new FileWriter(file, true);
                writeInFile(fw, strArr);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package day9.filehandlingdemo;

import java.io.*;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        String fileLocation = "data/text1.txt";
        File file = new File(fileLocation);
        System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());

        FileOutputStream fOut = new FileOutputStream(file);
        BufferedOutputStream bout = new BufferedOutputStream(fOut);

        String s = "Hello World - buffered";
        byte byteArray[] = s.getBytes();

        bout.write(byteArray);
        bout.close();
        fOut.close();


    /*
        byte barry[] = s.getBytes();
        fOut.write(barry);
        fOut.close();

    */

    FileInputStream fInput = new FileInputStream(file);

    int i = 0;
    while ((i = fInput.read()) != -1) {
        System.out.print((char) i);
    }
    fInput.close();
    }

    //BufferedInputStream buffInput = new BufferedInputStream(fInput);
}

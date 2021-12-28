package Lab4;

import java.io.*;
import java.util.Random;

class MyFile extends File{
    private Random random;

    private int getRandomInt(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public void randomInit(int min, int max) throws IOException {
        FileOutputStream fout = new FileOutputStream(this);
        final int N = 200;
        for(int i = 0; i < N; i++)
            fout.write((getRandomInt(min, max) + "\n").getBytes());
        fout.close();
    }

    public MyFile(String filePath) {
        super(filePath);
        random = new Random();
    }

    public String get(int index) throws IOException {
        FileInputStream fin = new FileInputStream(this);
        String fileString = "";
        int ch;
        while((ch = fin.read()) != -1) fileString += (char)ch;
        fin.close();
        return fileString.split("\n")[index];
    }
}

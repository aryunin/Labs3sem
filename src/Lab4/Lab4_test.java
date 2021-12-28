package Lab4;

import java.io.File;
import java.io.IOException;

public class Lab4_test {
    private static float division(float divisible, float divider) throws Exception {
        if(divider == 0) throw new Exception("division by zero");
        if(divider < divisible / Float.MAX_VALUE) throw new Exception("upper overflow");
        if(divider > divisible / Float.MIN_VALUE) throw new Exception("lower overflow");

        return divisible / divider;
    }

    public static void testEx1() {
        float[] divisibles = {120.4f, 10f, 4f, Float.MAX_VALUE / 2f, Float.MIN_VALUE * 2f };
        float[] dividers = {4f, 100f, 0f, 0.2f, 3f };

        for (int i = 0; i < 5; i++) {
            try {
                System.out.print(i + ") " + divisibles[i] + " / " + dividers[i] + " = ");
                float result = division(divisibles[i], dividers[i]);
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void testEx2() {
        MyFile file = new MyFile(System.getProperty("user.dir") + "\\randFile.txt");

        try {
            file.randomInit(0, 10000);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(file.get(3));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void ex3(File f1, File f2) {

    }

    public static void testEx3() {
        File f1 = new File(System.getProperty("user.dir") + "\\lab4file1.txt");
        File f2 = new File(System.getProperty("user.dir") + "\\lab4file2.txt");
        ex3(f1,f2);
    }
}

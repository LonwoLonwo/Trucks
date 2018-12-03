import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trucks
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Число ящиков: ");
        int a = 0;
        a = Integer.parseInt(reader.readLine());

        int b = a/27;

        int c = b/12;

        int count = 0;

        for (int j = 0; j <= c && j < 12; j++) {
            System.out.println("Грузовик " + (j + 1) + ":");
            for (int y = 0; y <= b && y < 27; y++) {
                System.out.println("Контейнер " + (y + 1) + ":");
                for (int i = 0; i <= a; i++) {
                    System.out.println("Ящик " + (i + 1));
                    count++;
                }
            }
        }

    }
}

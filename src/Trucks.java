import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trucks
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Число ящиков: ");
        int a = Integer.parseInt(reader.readLine());

        int b = a/27;

        int c = b/12;

        for (int j = 1; j < c; j++) {
            System.out.println("Грузовик " + j + ":");
            for (int y = 1; y < 12; y++) {
                System.out.println("Контейнер " + y + ":");
                for (int i = 1; i < 27; i++) {
                    System.out.println("Ящик " + i);
                }
            }
        }

    }
}

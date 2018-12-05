import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trucks
{
    private static int containerCapacity = 27;
    private static int truckCapacity = 12;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Число ящиков: ");
        int boxTotalCount = 0;
        boxTotalCount = Integer.parseInt(reader.readLine());

        int containerCount = boxTotalCount/containerCapacity;

        int trucksCount = containerCount/truckCapacity;

        int containerCounter = 0;
        int boxCounter = 0;

        for (int j = 0; j <= trucksCount; j++) {
            System.out.println("Грузовик " + (j + 1) + ":");
            for (int y = 0; boxCounter <= boxTotalCount && y < truckCapacity; y++, containerCounter++) {
                System.out.println("Контейнер " + (containerCounter + 1) + ":");
                for (int i = 0; boxCounter <= boxTotalCount && i < containerCapacity; i++, boxCounter++) {
                    System.out.println("Ящик " + (boxCounter + 1));
                }
            }
        }

    }
}

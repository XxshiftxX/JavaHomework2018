import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class java305 {
    public static void executer()
    {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++)
        {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        String result = Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.print(result);
    }
}

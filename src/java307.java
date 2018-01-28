import java.util.Arrays;
import java.util.stream.Collectors;

public class java307 {
    public static void executer()
    {
        int[][] array = new int[4][4];

        for(int i = 0; i<4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                array[i][j] = (int)(Math.random() * 9 + 1);
            }
        }

        for(int[] tempArray: array)
        {
            String result = Arrays.stream(tempArray)
                    .mapToObj(String::valueOf)
                    .collect(Collectors.joining(" | "));

            System.out.println(result);
        }
    }
}

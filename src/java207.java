import java.util.Scanner;

public class java207 {
    public static void executer()
    {
        int x, y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("오데 있숩니까?\n ㄴ");
        x = scanner.nextInt();
        y = scanner.nextInt();

        if(x >= 50 && x <= 100 && y >= 50 && y <= 100)
        {
            System.out.println("안에 있슴미다!");
        }
        else
        {
            System.out.println("없슴미다!!");
        }
    }
}

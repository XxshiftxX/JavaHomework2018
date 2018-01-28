public class java402 {
    public static void executer()
    {
        Rectangle rectangle = new Rectangle();
        rectangle.show();

        rectangle = new Rectangle(1, 7, 1, 10);
        rectangle.show();
        System.out.println("넓이는 " + rectangle.square());
    }
}

class Rectangle
{
    int x1, y1;
    int x2, y2;

    public Rectangle()
    {
        x1 = 0;
        x2 = 4;
        y1 = 0;
        y2 = 4;
    }

    public Rectangle(int x1, int x2, int y1, int y2)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int square()
    {
        return Math.abs((x2 - x1) * (y2 - y1));
    }

    public void show()
    {
        System.out.println("점1 - (" + x1 + ", " + y1 + ")");
        System.out.println("점2 - (" + x2 + ", " + y2 + ")");
        System.out.println("넓이 : " + square());
    }

    public boolean equals(Rectangle r)
    {
        return x1 == r.x1 && x2 == r.x2 && y1 == r.y1 && y2 == r.y2;
    }
}

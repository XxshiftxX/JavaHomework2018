public class java405 {
    public static void executer()
    {

    }
}

abstract class cal
{
    int a, b;

    public abstract int calculate();

    public void setValue(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}

class add extends cal
{
    @Override
    public int calculate() {
        return a + b;
    }
}

class sub extends cal
{
    @Override
    public int calculate()
    {
        return a - b;
    }
}

class mul extends cal
{
    @Override
    public int calculate()
    {
        return a * b;
    }
}

class div extends cal
{
    @Override
    public int calculate()
    {
        return a / b;
    }
}
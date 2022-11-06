public class TestThrow
{
    static void method() throws IllegalAccessException
    {
        System.out.println("внутри метода");
        // . . .
        throw new IllegalAccessException
                ("исключение в методе");
    }
    public static void main(String args[])
    {
        try {
            method();
        } catch(IllegalAccessException  e) {
            System.out.println("Catch внутри main : " +
                    e.getMessage());
        }
    }
}
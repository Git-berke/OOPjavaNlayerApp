package oopwithNLayer.Core.logging;

public class DataBaseLogger implements Logger{
    @Override
    public void log(String message)
    {
        System.out.println("Veritabanına loglandı : " + message);

    }
}

package oopwithNLayer.Core.logging;

public class MailLogger implements Logger{
    public void log(String message)
    {
        System.out.println("Mail Gönderildi : " + message);

    }
}

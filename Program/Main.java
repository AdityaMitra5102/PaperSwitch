import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        Process ec=Runtime.getRuntime().exec("sh /home/pi/Desktop/Program/run.sh");
        new Server().main();
    }
}
import java.io.*;
class Test
{
    static void on()
    {
        try
        {
            Process ec=Runtime.getRuntime().exec("switchon.bat");
            System.out.println("Turning on");
        }
        catch(Exception excep){}
    }
    
    static void off()
    {
        try
        {
            Process ec=Runtime.getRuntime().exec("switchoff.bat");
            System.out.println("Turning off");
        }
        catch(Exception excep){}
    }
}
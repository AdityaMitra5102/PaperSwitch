import java.io.*;
import java.util.*;
import java.net.*;
class Server
{
    public void main()
    {
        try
        {
            while(true)
            {
                System.out.println("Server Reset: Waiting for connection 2334");
                ServerSocket ss=new ServerSocket(2334);
                Socket s=ss.accept();
                System.out.println("Connected");
                BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
                String str=br.readLine();
                System.out.println(str);
                if (str.contains("switchon"))
                {
                    Test.on();
                }
                if (str.contains("switchoff"))
                {
                    Test.off();
                }
                br.close();
                s.close();
                ss.close();
            }
        }
        catch(Exception excep)
        {
            excep.printStackTrace();
        }
    }
}
import java.io.*;
import java.net.*;
class Client
{
    public static void main(String args[])throws Exception
    {
        URL ob=new URL("http://localhost/testpage");
        HttpURLConnection conn=(HttpURLConnection)ob.openConnection();
        conn.setRequestMethod("POST");
        conn.setDoOutput(true);
        OutputStream os=conn.getOutputStream();
        os.write("switchon".getBytes());
        os.flush();
        os.close();
        int responseCode = conn.getResponseCode();
        System.out.println("POST Response Code :: " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { //success
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("POST request not worked");
        }
    }
}
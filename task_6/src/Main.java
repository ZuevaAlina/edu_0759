//Записать в файл good_ip.txt рабочие ip адреса в виде ip:port
import java.io.*;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;


public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/alinocka/Desktop/JAVA/ip.txt");
            int i;
            String proxy = "";
            while((i=fis.read()) != -1){
                if (i==13) continue;
                else if (i==10){
                    String ip = proxy.split(":")[0];
                    String port = proxy.split(":")[1];
                    checkProxy(ip, Integer.parseInt(port));
                    proxy = "";
                }else if(i!=9){
                    proxy += (char)i;
                }else{
                    proxy += ":";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void checkProxy(String ip, int port) throws FileNotFoundException {
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress(ip,port));
            URLConnection urlConnection = new URL("https://www.vozhzhaev.ru/test.php").openConnection(proxy);
            urlConnection.setConnectTimeout(5000);
            urlConnection.connect();
            InputStream is = urlConnection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            int i;
            StringBuilder result = new StringBuilder();
            while ((i = reader.read()) != -1) {
                result.append((char)i);
            }
            FileOutputStream fos = new FileOutputStream("/Users/alinocka/Desktop/JAVA/good_ip.txt",true);
            PrintStream printStream = new PrintStream(fos);
            printStream.println(result+":"+port);
        }catch (IOException e) {
            FileOutputStream fos2 = new FileOutputStream("/Users/alinocka/Desktop/JAVA/good_ip.txt", true);
            PrintStream printStream = new PrintStream(fos2);
            printStream.print("");
        }
    }
}

//Анонимный класс
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
                if(i==13) continue;
                else if(i==10){
                    String ip = proxy.split(":")[0];
                    String port = proxy.split(":")[1];
                    //новая строка
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress(ip, Integer.parseInt(port)));
                                URL url = new URL("https://vozhzhaev.ru/test.php");
                                URLConnection urlConnection = url.openConnection(proxy);
                                InputStream is = urlConnection.getInputStream();
                                InputStreamReader reader = new InputStreamReader(is);
                                int i;
                                StringBuilder result = new StringBuilder();
                                while ((i=reader.read()) != -1){
                                    result.append((char)i);
                                }
                                System.out.println(result);
                            } catch (IOException exception) {
                                System.out.println(ip+" - не работает!");
                            }
                        }
                    });
                    thread.start();
                    proxy = "";
                }else if(i!=9){
                    proxy += (char) i;
                }else{
                    proxy += ":";
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

class RunCheckProxy implements Runnable{
    String ip;
    int port;

    public RunCheckProxy(String ip, int port) {
        super();
        this.ip = ip;
        this.port = port;
    }

    @Override
    public void run() {
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP,new InetSocketAddress(ip,port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            URLConnection urlConnection = url.openConnection(proxy);
            InputStream is = urlConnection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            int i;
            StringBuilder result = new StringBuilder();
            while ((i=reader.read()) != -1){
                result.append((char)i);
            }
            System.out.println(result);
        } catch (IOException exception) {
            System.out.println(ip+" - не работает!");
        }
    }
}







package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.InetAddress;

/**
 * Created by אביב on 1/14/2016.
 */
public class TCP {
    private String server_ip;
    private int port;

    TCP() {
        server_ip = "127.0.0.1";
        port = 5555;
    }
    public void SetIpAndPort(String ip, int port){
        this.server_ip=ip;
        this.port=port;
    }
    public String getServer_ip(){
        return server_ip;
    }
    public int getPort(){
        return port;
    }
}

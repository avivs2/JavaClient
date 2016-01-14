package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by aviv on 1/14/2016.
 */
public class Communicator {
    private String server_ip;
    private int port;
    private PrintWriter out;
    private BufferedReader in;
    private Socket socket;

    Communicator () {
        this.server_ip = "127.0.0.1";
        this.port = 5555;
        this.Init();
    }

    private void Init() {
        try {

            this.socket = new Socket(InetAddress.getByName(this.server_ip), this.port);

             this.out= new PrintWriter(socket.getOutputStream(), true);

             this.in= new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    public void SendMessage(String data){
        out.println(data);
    }
    public void RecieveMessage() {
        try {
            String fromServer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void SetIpAndPort(String ip,int port) {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.server_ip = ip;
        this.port = port;
        this.Init();
    }
    public String getServer_ip(){
        return server_ip;
    }
    public int getPort(){
        return port;
    }
}

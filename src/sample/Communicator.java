package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by אביב on 1/14/2016.
 */
public class Communicator {
    private TCP myProt;
    private PrintWriter out;
    private BufferedReader in;
    void Init() {
        try {

            Socket socket = new Socket(InetAddress.getByName(myProt.getServer_ip()), myProt.getPort());

             this.out= new PrintWriter(socket.getOutputStream(), true);

             this.in= new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
    void SendMessage(String data){
        out.println(data);
    }
    void RecieveMessage() {
        try {
            String fromServer = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void SetIpAndPort(String ip,int port){
        myProt.SetIpAndPort(ip,port);
    }
}

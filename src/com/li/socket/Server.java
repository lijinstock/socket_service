/**
 * decription:
 *
 * @author:Administrator
 * @date:2019/8/6 19:01
 */

package com.li.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(8888);
       Socket s = ss.accept();
       String result = new PersonServiceImpl().sayHello("张学友");
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        out.write(result);
        out.flush();
        out.close();
        s.close();
        ss.close();

    }
}

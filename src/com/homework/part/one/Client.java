package com.homework.part.one;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client extends Thread {
    public static void main(String[] args) {
        String message = "";
        try {
            while (!message.equals("q")) {
                Socket s1 = new Socket("localhost", 3128);
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                message = reader.readLine();
                s1.getOutputStream().write(message.getBytes());

                byte[] buf = new byte[64 * 1024];
                int r = s1.getInputStream().read(buf);
                String data = new String(buf, 0, r);

                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println("init error: " + e);
        }
    }

}

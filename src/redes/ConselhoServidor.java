/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redes;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author diego
 */
public class ConselhoServidor {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(5000);
        while(true){
          Socket socket = server.accept();
            try(PrintWriter w = new PrintWriter(socket.getOutputStream());) {
                w.println("Aprenda java e seja contratado");
            }          
          
        }
    }
}

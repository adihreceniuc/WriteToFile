/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writetofile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Adi Hreceniuc
 */
public class WriteToFile {

    public static void main(String[] args) throws IOException {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("What do you want to write to the file?:)");
            String content = in.readLine();
            Utils.WriteTo(content, "output.txt");

        } catch (IOException e) {
            System.out.println(e);
        }

    }

}

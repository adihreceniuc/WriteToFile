/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writetofile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author adico
 */
public class Utils {

    protected static void WriteTo(String content, String fileName) throws IOException {

        Files.write(Paths.get(fileName), content.getBytes());

    }
}

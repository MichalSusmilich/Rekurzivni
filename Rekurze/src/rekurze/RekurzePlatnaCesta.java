/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rekurze;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 *
 * @author michal.susmilich
 */
public class RekurzePlatnaCesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String actualDir = System.getProperty("user.dir");
            File f = new File(actualDir);
           vypisCestu(f);
    }
    public static void vypisCestu(File path){
        File f[]; 
        f = path.listFiles();
        for(int i = 0; i < f.length; i++){
            System.out.println(f[i].getName());
        }
        
        
        
    }
    
}

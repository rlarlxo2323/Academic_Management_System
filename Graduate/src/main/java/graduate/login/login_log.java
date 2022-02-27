/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduate.login;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author rlarl
 */
public class login_log {
    public String[] login_log;
    
    public void Read_log(){
        try{
        File file = new File("C:\\DB\\login_data\\login_log.txt");
        FileReader filereader = new FileReader(file);
            try (BufferedReader bufReader = new BufferedReader(filereader)) {
                String line="";
                
                line = bufReader.readLine();
                login_log=line.split("\t");
                
    bufReader.close();
                }filereader.close();
        }catch(IOException ex){
            System.out.println(ex);
        }}
    
    public void Write_log(){ 
    try{
            File file = new File("C:\\DB\\login_data\\login_log.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
          
            for(int m=0;m<login_log.length;m++)
            { 
               
               bw.write(login_log[m]+"\t");
               
            }
            bw.write("\n");
            bw.close();
            fw.close();
        }catch(IOException ex){
            System.out.println(ex);
        }
        }
}


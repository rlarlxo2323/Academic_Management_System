/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graduate.login;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
public class test_correct {

    
       public boolean login_status;
       public String login_sirial;
       public String real_id;
       public String real_pw;
       public String[] login_log;
      
    
   void correct_login(){
       
       if(real_id.contains("S")){
    try{
        File file = new File("C:\\DB\\login_data\\student_table.txt");
        FileReader filereader = new FileReader(file);
            try (BufferedReader bufReader = new BufferedReader(filereader)) {
                String line="";
                String[]str = null;
                while(line != null){
                line = bufReader.readLine();
                str=line.split("\t");
                if(str[0].equals(real_pw) && str[1].equals(real_id)){
                    JOptionPane.showMessageDialog(null, "학생 로그인 성공");
                    login_status = true;
                    login_sirial = "S";
                    break;
                }
                if(str[0].equals("****")){
                
                    JOptionPane.showMessageDialog(null, "로그인 실패");
                    login_status = false;
                }
                
                }
              login_log=str;
                bufReader.close();
             } filereader.close();
               
    }catch (FileNotFoundException e){
    System.out.println(e);
}catch(IOException e){
    System.out.println(e);
}
   }
       ////////////////////////////////////////////
       else if(real_id.contains("P")){
    try{
        File file = new File("C:\\DB\\login_data\\professor_table.txt");
        FileReader filereader = new FileReader(file);
            try (BufferedReader bufReader = new BufferedReader(filereader)) {
                String line="";
                String[]str = null;
                while(line != null){
                line = bufReader.readLine();
                str=line.split("\t");
                if(str[0].equals(real_pw) && str[1].equals(real_id)){
                    JOptionPane.showMessageDialog(null, "교수 로그인 성공");
                    login_status = true;
                    login_sirial = "P";
                    break;
                }
                if(str[0].equals("****")){
                
                    JOptionPane.showMessageDialog(null, "로그인 실패");
                    login_status = false;
                }
                
                }
              login_log=str;
                bufReader.close();
             } filereader.close();
               
    }catch (FileNotFoundException e){
    System.out.println(e);
}catch(IOException e){
    System.out.println(e);
}
   }
       /////////////////////////////////////////////
       else {
       try{
        File file = new File("C:\\DB\\login_data\\staff_table.txt");
        FileReader filereader = new FileReader(file);
            try (BufferedReader bufReader = new BufferedReader(filereader)) {
                String line="";
                String[]str = null;
                while(line != null){
                line = bufReader.readLine();
                str=line.split("\t");
                if(str[0].equals(real_pw) && str[1].equals(real_id)){
                    if(real_id.contains("H")){
                        JOptionPane.showMessageDialog(null, "학사담당자 로그인 성공");
                        login_status = true;
                        login_sirial = "H";
                        break;
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "수업담당자 로그인 성공");
                        login_status = true;
                        login_sirial = "G";
                        break;
                    }
                }
                if(str[0].equals("****")){
                
                    JOptionPane.showMessageDialog(null, "로그인 실패");
                    login_status = false;
                }
                
                }
              login_log=str;
                bufReader.close();
             } filereader.close();
               
    }catch (FileNotFoundException e){
    System.out.println(e);
}catch(IOException e){
    System.out.println(e);
}
   }
}
}
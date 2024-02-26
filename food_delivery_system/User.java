
package food_delivery_system;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Alert;

public abstract class User {
     protected String uname,password, group;
    
    
    public User() {
    }

    public User(String uname, String password, String group) {
        this.uname = uname;
        this.password = password;
        this.group = group;
    }

    
    public String getName() {
        return uname;
    }

    public void setName(String name) {
        this.uname = name;
    }

   
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "User{" + "uname=" + uname + ", password=" + password + ", group=" + group + '}';
    }

    
  
    public String login( String name, String upassword, String ugroup) throws ClassNotFoundException, FileNotFoundException, IOException{
        
      
       int check = 0; 
       String x=null,y=null,z=null;
      
            File f = null;
        FileInputStream fis = null;
        //BufferedInputStream bis = null;
        DataInputStream dis = null;
        
        try{ 
            f = new File("user.bin");
            if(!f.exists()){
                System.out.println("Oops! user.bin binary file does not exist...");
            }
            else{
                   fis = new FileInputStream(f);
                //bis = new BufferedInputStream(fis);
                //dis = new DataInputStream(bis);
                dis = new DataInputStream(fis);
                    while(true)
                    {
                         
                      x = dis.readUTF();
                        System.out.println(x);
                      y = dis.readUTF();
                        System.out.println(y);
                      z = dis.readUTF();
                        System.out.println(z);

                      if(name.equals(x)& upassword.equals(y)& ugroup.equals(z))
                      {
                            check = 1;
                           
                      }
                    }
            }
          
        }
        catch(IOException e){
           e.printStackTrace();
           
        }finally {
            
                if(dis != null) dis.close();
        }
      
       
       if(check==1)
            return ugroup;
       else
           return "null";
    }
}

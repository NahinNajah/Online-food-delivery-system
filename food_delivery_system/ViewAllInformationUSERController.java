/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ViewAllInformationUSERController implements Initializable {

    private TableColumn<View, String> name;
    private TableColumn<View, String> email;
    private TableColumn<View, String> password;
    
    @FXML
    private Button ViewButton;
    @FXML
    private TextArea Showtxt;
    @FXML
    private Button rtrnbtn;
            
     
    /**
     * Initializes the controller class.
     */
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void ViewButton(ActionEvent event) {
        Showtxt.setText("");
        File f = null;
        FileInputStream fis = null;
        //BufferedInputStream bis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("user.bin");
            if(!f.exists()){
                Showtxt.setText("Oops! EmpData.bin binary file does not exist...");
            }
            else{
                
                fis = new FileInputStream(f);
                //bis = new BufferedInputStream(fis);
                //dis = new DataInputStream(bis);
                dis = new DataInputStream(fis);
                //String str="";
                while(true){
                    str+= "Name:"+dis.readUTF()
                        +"; email:"+dis.readUTF()
                        +"; pass:"+dis.readUTF()+"\n";
                         
                    //outputTextArea.setText(str);
                }//while
                //outputTextArea.setText(str);
            }//else
        } catch (IOException ex) {
            Showtxt.setText(str);
            Logger.getLogger(ViewAllInformationUSERController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                Logger.getLogger(ViewAllInformationUSERController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }          
}

    @FXML
    private void Return(ActionEvent event)  throws Exception {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        Parent root = FXMLLoader.load(getClass().getResource("CeoScene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }
}
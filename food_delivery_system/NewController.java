/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class NewController implements Initializable {

    @FXML
    private Button webButton;
    @FXML
    private Button AddverButton;
    @FXML
    private Button returnbutton;
    @FXML
    private TextField webtxt;
    @FXML
    private TextField advertxt;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void WebButton(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        //BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("link.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            
            //bos = new BufferedOutputStream(fos);
            //dos = new DataOutputStream(bos);
            dos = new DataOutputStream(fos);
            
            
            
            dos.writeUTF(webtxt.getText());
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }        
    }

    @FXML
    private void AdvertisementButton(ActionEvent event) {
        File f = null;
        FileOutputStream fos = null;
        //BufferedOutputStream bos = null;
        DataOutputStream dos = null;
        
        try {
            f = new File("link.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);
            
            //bos = new BufferedOutputStream(fos);
            //dos = new DataOutputStream(bos);
            dos = new DataOutputStream(fos);
            
            
            
            dos.writeUTF(advertxt.getText());
            
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if(dos != null) dos.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }        
    }

    @FXML
    private void ReturnButton(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("ResturantManagerScene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();            

    }
    
}

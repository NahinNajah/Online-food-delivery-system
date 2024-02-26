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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ViewPaymentController implements Initializable {

    @FXML
    private TextArea txtarea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewButton(ActionEvent event) {
        txtarea.setText("");
        File f = null;
        FileInputStream fis = null;
        //BufferedInputStream bis = null;
        DataInputStream dis = null;
        String str="";
        try {
            f = new File("Payment.bin");
            if(!f.exists()){
               txtarea.setText("Oops!file does not exist...");
            }
            else{
                
                fis = new FileInputStream(f);
                //bis = new BufferedInputStream(fis);
                //dis = new DataInputStream(bis);
                dis = new DataInputStream(fis);
                //String str="";
                while(true){
                    str+= dis.readUTF()+"\n";
                         
                    //outputTextArea.setText(str);
                }//while
                //outputTextArea.setText(str);
            }//else
        } catch (IOException ex) {
            txtarea.setText(str);
            ex.printStackTrace();
        } finally {
            try {
                if(dis != null) dis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }          
    }

    @FXML
    private void returnButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ResturantManagerScene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void ReturnSeleButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ADUserTble.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }
}

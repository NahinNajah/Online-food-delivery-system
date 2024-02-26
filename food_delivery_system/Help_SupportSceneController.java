/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class Help_SupportSceneController implements Initializable {

    @FXML
    private ComboBox<String> helpCombobox;
    @FXML
    private TextField username;
    @FXML
    private ComboBox<String> UserType;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        helpCombobox.getItems().addAll(
            "Get help with my orders", "I'm having trouble placing an order", "Trouble regarding my Account", "Billing Issue", "Bad service "
        );
         UserType.getItems().addAll(
            "Customer", "Delivery person", "Restaurant Manager"
        );
    }    

    @FXML
    private void Onclicksubmit(ActionEvent event) throws IOException {
        File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
        
         try {
            
            f = new File("Help&support Detail.txt");  
            
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	username.getText()+","
                +UserType.getValue()+","
                +helpCombobox.getValue()+"\n"	
            );           
            
        }catch(IOException ex){
               ex.printStackTrace();
        }
         finally {
                if(fw != null) fw.close();
                  } 
    
    }

    @FXML
    private void backtoscene(ActionEvent event) throws IOException {
        String str = UserType.getValue();
        String user1 = new String ("Customer");
        String user2 = new String ("Delivery person");
        String user3 = new String ("Restaurant Manager");
        
        if(str.equals(user1))
        {
            Parent root = FXMLLoader.load(getClass().getResource("Customer scene.fxml"));

            Scene scene = new Scene(root);
            Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }
        
        if(str.equals(user2))
        {
            Parent root = FXMLLoader.load(getClass().getResource("Rider scene.fxml"));

            Scene scene = new Scene(root);
            Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }
        
        if(str.equals(user3))
        {
            Parent root = FXMLLoader.load(getClass().getResource("ResturantManagerScene.fxml"));

            Scene scene = new Scene(root);
            Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }
    }
    
}

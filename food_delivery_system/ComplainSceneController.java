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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ComplainSceneController implements Initializable {

    @FXML
    private TextField pname;
    @FXML
    private TextArea Complaintext;
    @FXML
    private ComboBox<String> usertype;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       usertype.getItems().addAll(
            "Customer", "Delivery person", "Restaurant Manager","CEO"
        );
    }    

    @FXML
    private void clicktosubmit(ActionEvent event) throws IOException {
         File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
        
         try {
            
            f = new File("Complain Detail.txt");  
            
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	pname.getText()+","
                +usertype.getValue()+","
                +Complaintext.getText()+"\n"	
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
        
       String str = usertype.getValue();
        String user1 = new String ("Customer");
        String user2 = new String ("Delivery person");
        String user3 = new String ("Restaurant Manager");
        String user4 = new String ("CEO");
        
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
        
         if(str.equals(user4))
        {
            Parent root = FXMLLoader.load(getClass().getResource("CeoScene.fxml"));

            Scene scene = new Scene(root);
            Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }
    }
    
}

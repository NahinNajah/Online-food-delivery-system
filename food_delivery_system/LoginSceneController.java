/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

import java.io.FileNotFoundException;
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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class LoginSceneController implements Initializable {

    @FXML
    private TextField username;
    @FXML
    private Label wronglogin;
    @FXML
    private PasswordField pass;
    @FXML
    private ComboBox<String> UserComboBox;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        UserComboBox.getItems().addAll(
            "Customer", "Delivery person", "Accountant", "Help and Support Manager","Restaurant Manager","CEO","HR Manager","Office Assistant"
        );
    }    

    @FXML
    private void Checklogin(ActionEvent event) throws FileNotFoundException, IOException, ClassNotFoundException  {
        String str,fail= "null";
        String user1 = new String ("Customer");
        String user2 = new String ("Delivery person");
        String user3 = new String ("Accountant");
        String user4 = new String ("Help and Support Manager");
        String user5 = new String ("Restaurant Manager");
        String user6 = new String ("CEO");
        String user7 = new String ("HR Manager");
        String user8 = new String ("Office Assistant");
        Customer u = new Customer();
       
      str = u.login(username.getText(), pass.getText(), UserComboBox.getValue());
        System.out.println(str);
        
       if(str.equals(user1) )
                
        {   
             wronglogin.setText("Login Succesfull");
             Parent root = FXMLLoader.load(getClass().getResource("Customer scene.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Customer scene");
             stage.setScene(scene);
             stage.show();
             
         }
        
        else if(str.equals(user2) )
                
        {   
            wronglogin.setText("Login Succesfull");
             Parent root = FXMLLoader.load(getClass().getResource("Rider scene.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Rider scene");
             stage.setScene(scene);
             stage.show();
          
         }
        else if(str.equals(user3) )
                
        {   
            wronglogin.setText("Login Succesfull");
             Parent root = FXMLLoader.load(getClass().getResource("AccountantScene.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Accountant Scene");
             stage.setScene(scene);
             stage.show();
            
         }         
       else if(str.equals(user4) )
                
        {   
            wronglogin.setText("Login Succesfull");
             Parent root = FXMLLoader.load(getClass().getResource("SupportManagerScene.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Help&Support Scene");
             stage.setScene(scene);
             stage.show();
            
         } 
       else if(str.equals(user5) )
                
        {   
            wronglogin.setText("Login Succesfull");
             Parent root = FXMLLoader.load(getClass().getResource("ResturantManagerScene.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Resturant Manager Scene");
             stage.setScene(scene);
             stage.show();
            
         }         
       else if(str.equals(user6) )
                
        {   
            wronglogin.setText("Login Succesfull");
            Parent root = FXMLLoader.load(getClass().getResource("CeoScene.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Ceo Scene");
             stage.setScene(scene);
             stage.show(); 
            
         }         
       else if(str.equals(user7) )
                
        {   
            wronglogin.setText("Login Succesfull");
             Parent root = FXMLLoader.load(getClass().getResource("Hr manager.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("HRmanger Scene");
             stage.setScene(scene);
             stage.show();
            
         }         
       else if(str.equals(user8) )
                
        {   
            wronglogin.setText("Login Succesfull");
             Parent root = FXMLLoader.load(getClass().getResource("Office assistant.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Office Assistant");
             stage.setScene(scene);
             stage.show();
            
         } 
       else if(str.equals(fail) )
       {
            wronglogin.setText("Login Failed");
            Alert a = new Alert(Alert.AlertType.WARNING);
            a.setTitle("Warning Alert");
            a.setContentText("Entered Wrong Login Information!");
            a.setHeaderText(null);
            a.showAndWait(); 
       }
           
            
    }
    
}

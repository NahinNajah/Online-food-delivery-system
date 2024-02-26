/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class FoodAddFXMLController implements Initializable {
    
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField priceTextField;
    @FXML
    private Button addStudentButton;
    @FXML
    private Label namelebel;
    
    
   static ArrayList<Food> FoodArrayList;
    @FXML
    private Button sendButton;
    @FXML
    private Button cancelButton;

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        FoodArrayList= new ArrayList<Food>();
             
    }    

    @FXML
    private void AddFoodButtonHandler(ActionEvent event) throws IOException {
        boolean datavalid = true;
        
        String nameStr = nameTextField.getText().trim();
        String priceStr = priceTextField.getText().trim();
       
        if (datavalid == true) 
        {
            if(nameStr.length() == 0){
                
            
            
                
             JOptionPane.showMessageDialog(null,"\"Error: Name cannot be blank.\"");
             datavalid=false;
                
          } 
        }
        if(datavalid == true){
            if(priceStr.length() == 0){
                
            
             JOptionPane.showMessageDialog (null, "Error: Price cannot be blank.");
             datavalid = false;
            }
        }
            
        
        if (datavalid == true)
        {
            Food f = new Food (nameStr,priceStr);
                                     

            FoodArrayList.add (f);
         
            JOptionPane.showMessageDialog (null, "Success: Food created.");
             Parent root = FXMLLoader.load(getClass().getResource("Add.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage;
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
        }
    }

    @FXML
    private void SendButton(ActionEvent event) {
    }

    @FXML
    private void CancelButton(ActionEvent event) {
    }
}



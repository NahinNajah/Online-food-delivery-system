/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ViewAllFoodController implements Initializable {

    @FXML
    private TextArea DisplayTextArea;
    @FXML
    private Button returnButton;
    @FXML
    private Button OrderButton;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        // setText(), getText()
        
        String outStr =" Item_name                Price                "                + "\n" +
                        "-------  ------------------- " + "\n";
        
        for (Food f: FoodAddFXMLController.FoodArrayList)
        {
            outStr += f.toString() + "\n";
        }
        
        
        
        DisplayTextArea.setText (outStr);
        
       
        
        
    }    
       
     
// TODO
       

    @FXML
    private void returnButtonHandler(ActionEvent event)throws Exception {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        Parent root = FXMLLoader.load(getClass().getResource("Customer scene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void OrderButtonHandler(ActionEvent event) throws Exception {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        Parent root = FXMLLoader.load(getClass().getResource("ForConfirmOrder.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

}


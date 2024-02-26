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
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class DeliveryOrderSceneController implements Initializable {

    @FXML
    private TextField OrderId;
    @FXML
    private TextField orderaddress;
    @FXML
    private TextField Foodname;
    @FXML
    private TextField FoodPrice;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ClearOrderId(MouseEvent event) {
        OrderId.clear();
    }

    @FXML
    private void clearorderaddress(MouseEvent event) {
        orderaddress.clear();
    }

    @FXML
    private void clearFoodname(MouseEvent event) {
        Foodname.clear();
    }

    @FXML
    private void clearFoodprice(MouseEvent event) {
        FoodPrice.clear();
    }

    @FXML
    private void CreateOrderOnClick(ActionEvent event) throws IOException {
        File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
        
         try {
            
            f = new File("Delivery Order Detail.txt");  
            
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	OrderId.getText()+","
                +orderaddress.getText()+","
                +Foodname.getText()+","
                +FoodPrice.getText()+"\n"	
            );           
            
        }catch(IOException ex){
               ex.printStackTrace();
        }
         finally {
                if(fw != null) fw.close();
                  } 
    }

    @FXML
    private void backOnClick(ActionEvent event) throws IOException {
             Parent root = FXMLLoader.load(getClass().getResource("ResturantManagerScene.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Resturant Manager Scene");
             stage.setScene(scene);
             stage.show();
    }
    
}

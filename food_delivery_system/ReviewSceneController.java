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
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ReviewSceneController implements Initializable {

    @FXML
    private TextField CusName;
    @FXML
    private TextField ResName;
    @FXML
    private TextField ReviewRate;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void GoToCustomerScene(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("Customer scene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void SubmitResturantReview(ActionEvent event) throws IOException {
        
        File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
        
         try {
            
            f = new File("Resturant Review.txt");  
            
            if(f.exists()) fw = new FileWriter(f,true);
            else fw = new FileWriter(f);
           
            fw.write(
            	CusName.getText()+","
                +ResName.getText()+","		
                +ReviewRate.getText()+"\n"	
            );           
            
        }catch(IOException ex){
               ex.printStackTrace();
        }
         finally {
                if(fw != null) fw.close();
                  } 
    }

    @FXML
    private void nameOnClick(MouseEvent event) {
        CusName.clear();
    }

    @FXML
    private void ResNameOnClick(MouseEvent event) {
        ResName.clear();
    }

    @FXML
    private void ReviewOnClick(MouseEvent event) {
        ReviewRate.clear();
    }
    
}

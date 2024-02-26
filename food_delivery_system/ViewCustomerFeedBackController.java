/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class ViewCustomerFeedBackController implements Initializable {

    @FXML
    private TextArea txtarea;
    @FXML
    private Button viewButton;
    @FXML
    private Button Returnbutton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ViewButton(ActionEvent event) {
        txtarea.clear();
        File f = null;
        //FileReader fw = null;
        Scanner sc; String str; String[] tokens;
        try {
            f = new File("Resturant Review.txt");
            sc = new Scanner(f);
            if(f.exists()){
                txtarea.appendText("Content of Resturant Review.txt:\n");
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                    txtarea.appendText(
                            "CusName="+tokens[0]
                            +", ResName="+tokens[1]
                            +", ReviewRate="+tokens[2]
                            +"\n"                    
                    );
                }
            }
            else 
                txtarea.setText("oops! Resturant Review does not exist...");
        } 
        catch (IOException ex) {
            Logger.getLogger(ViewCustomerFeedBackController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally {
        }        
    }
    
    

    @FXML
    private void ReturnButton(ActionEvent event) throws IOException {
             Parent root = FXMLLoader.load(getClass().getResource("ResturantManagerScene.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Resturant Manager Scene");
             stage.setScene(scene);
             stage.show();
    }
    
}

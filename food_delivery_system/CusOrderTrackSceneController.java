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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CusOrderTrackSceneController implements Initializable {

    @FXML
    private TextArea OutputText;
    @FXML
    private TextField OrderID;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewOrderOnClick(ActionEvent event) {
        
         OutputText.clear();
        File f = null;
        Scanner sc; String str, Oid; String[] tokens;
        Oid = OrderID.getText();
        try {
            f = new File("Delivery Order Detail.txt");
            sc = new Scanner(f);
            if(f.exists()){
                OutputText.appendText("Your Order:\n");
                while(sc.hasNextLine()){
                    str=sc.nextLine();
                    tokens = str.split(",");
                  if(Oid.equals(tokens[0])) 
                  {
                          OutputText.appendText(
                            "Order Id="+tokens[0]
                            +", Order Address="+tokens[1]
                            +", Food Name="+tokens[2]
                            +", Food Price="+tokens[3]+"\n"                    
                    );
                  }
                }
            }
            else 
                OutputText.setText("oops! Your Order does not exist...");
        } 
        catch (IOException ex) {
             ex.printStackTrace();
        } 
        finally {
        }        
    }

    @FXML
    private void GoBackOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Customer scene.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Customer scene");
             stage.setScene(scene);
             stage.show();
    }
    
}

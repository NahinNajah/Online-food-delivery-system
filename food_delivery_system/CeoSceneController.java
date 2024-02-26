/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class CeoSceneController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GoBackOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login scene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Login scene");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void AddLoginUser(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AddUserScene.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void AccessUserOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("UserType.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void VeiwInfoOnClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ViewAllInformationUSER.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void VeiwWebsiteOnCick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("new.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void ViewComplainOnClick(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("Complain scene.fxml"));

            Scene scene = new Scene(root);
            Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
    }

    @FXML
    private void ViewNoticeOnClick(ActionEvent event) {
    }
    
}

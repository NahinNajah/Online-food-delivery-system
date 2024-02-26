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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ASUS
 */
public class OfficeAssistantController implements Initializable {

    @FXML
    private Button Submitreports;
    @FXML
    private Button Generateattendancereport;
    @FXML
    private Button Performancereport;
    @FXML
    private Button Employeeattendance;
    @FXML
    private Button Viewsalarypaymentreport;
    @FXML
    private Button next;
    @FXML
    private Button Return;
    @FXML
    private Button AssignedTask;
    @FXML
    private Button Applyforleaveapplication;
    @FXML
    private Button Notification;

    /**
     * Initializes the controller class.
     * @param url
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void SubmitreportsButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Submit Report.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    
    }

    @FXML
    private void GenerateattendancereportButton(ActionEvent event) {
    }


    @FXML
    private void NotificationButton(ActionEvent event) throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Notification.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void PerformancereportButton(ActionEvent event) {
    }

    @FXML
    private void EmployeeattendanceButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Employee Attendance2.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    
    }

    @FXML
    private void ViewsalarypaymentreportButton(ActionEvent event) {
    }

    @FXML
    private void nextButton(ActionEvent event) {
    }

    @FXML
    private void ReturnButton(ActionEvent event)throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Hr manager.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    private void AssignedTaskButtonOnClick(ActionEvent event)  throws IOException {
        Parent root;
        root = FXMLLoader.load(getClass().getResource("Assign Task 3.fxml"));
        
        Scene scene = new Scene(root);
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void ApplyforleaveapplicationButton(ActionEvent event) {
    }
    
}

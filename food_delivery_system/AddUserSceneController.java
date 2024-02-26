/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food_delivery_system;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class AddUserSceneController implements Initializable {

    @FXML
    private TextField Username;
    @FXML
    private ComboBox<String> UserGroup;
    @FXML
    private TextField password;
    private ArrayList<User> UserArr;
    @FXML
    private TableView<User> TableView;
    @FXML
    private TableColumn<User, String> nameCol;
    @FXML
    private TableColumn<User, String> passwordcol;
    @FXML
    private TableColumn<User, String> userCol;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       UserGroup.getItems().addAll(
            "Customer", "Delivery person", "Accountant", "Help and Support Manager","Restaurant Manager","CEO","HR Manager","Office Assistant"
        );
       UserArr = new ArrayList<User>();
       
       nameCol.setCellValueFactory(new PropertyValueFactory<User,String>("Name"));
        passwordcol.setCellValueFactory(new PropertyValueFactory<User,String>("Password"));
        userCol.setCellValueFactory(new PropertyValueFactory<User,String>("User Type"));
        TableView.setItems(getPeople());
        TableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
         
    }    

    
    public ObservableList<User> getPeople(){
        ObservableList<User> user = FXCollections.observableArrayList();
         User U = new User("suchi","iub","CEO") {};
         User u1 = new User("nahin","iub","Customer") {};
         User u2 = new User("raina","nsu","Accountant") {};
         user.add(U);
         user.add(u1);
         user.add(u2);
     
        return user;
    } 
    @FXML
    private void AddUserOnClick(ActionEvent event) {
      User p = new User(Username.getText(),password.getText(),UserGroup.getValue().toString()) {};
      ObservableList<User> person =  TableView.getItems();
         person.add(p) ;
         TableView.setItems(person);
       try {
           File f = null;
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        f = new File("user.bin");
            if(f.exists()) fos = new FileOutputStream(f,true);
            else fos = new FileOutputStream(f);          
            dos = new DataOutputStream(fos);
          
            dos.writeUTF(Username.getText());
            dos.writeUTF(password.getText());
            dos.writeUTF(UserGroup.getValue());
            
            
       
            dos.close();
   

        } catch (IOException e) {
           e.printStackTrace();
        } 
        
    }

    @FXML
    private void RemoveUserOnClick(ActionEvent event) {
         ObservableList<User> selectedRows, allinfo;
        allinfo = TableView.getItems();
        selectedRows = TableView.getSelectionModel().getSelectedItems();
        
        for(User p: selectedRows){
            allinfo.remove(p);
        }
    }

    @FXML
    private void BackToCeoScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CeoScene.fxml"));
             Scene scene = new Scene(root);
             Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
             stage.setTitle("Ceo Scene");
             stage.setScene(scene);
             stage.show(); 
    }

    
}

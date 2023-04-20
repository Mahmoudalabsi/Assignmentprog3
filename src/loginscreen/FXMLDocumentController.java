/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author mahmo
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ImageView loginPhoto;
     
   
    @FXML
    private TextField nameField;
    @FXML
    private TextField passwordField;
    @FXML
    private Button loginBtn;
    @FXML
    private Label statusField;
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginAction(ActionEvent event) {
          if(nameField.getText().equals("mahmoud") &&
                  passwordField.getText().equals("120210732"))
          {statusField.setText("Wellcome "+nameField.getText());
          new assignmentlap.Converting().show();
          Stage stage = (Stage) loginBtn.getScene().getWindow();
          stage.close();
              
        }else
              statusField.setText("Invalid user name or password");
             
    }
    
}

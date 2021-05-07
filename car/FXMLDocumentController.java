/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

/**
 *
 * @author victorli0825
 */

import java.net.URL;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

    @FXML
    private Label carLabel;

    @FXML
    private Label makeLabel;

    @FXML
    private Label modelLabel;

    @FXML
    private Label yearLabel;

    @FXML
    private Label infoLabel;

    @FXML
    private Label priceLabel;

    @FXML
    private Label mileageLabel;

    @FXML
    private Label stockNumberLabel;

    @FXML
    private Label imageLabel;

    @FXML
    private TextField makeTextField;

    @FXML
    private TextField modelTextField;

    @FXML
    private TextField yearTextField;

    @FXML
    private TextField infoTextField;

    @FXML
    private TextField priceTextField;

    @FXML
    private TextField mileageTextField;

    @FXML
    private TextField stockNumberTextField;

    @FXML
    public void NewSearchButtonPressed(ActionEvent event) {
        System.out.println("Click to start a new search");
        
    } 
    
    //@Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}


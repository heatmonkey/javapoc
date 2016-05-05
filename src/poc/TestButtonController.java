/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Paint;

/**
 *
 * @author James O'Donnell
 */
public class TestButtonController implements Initializable {
    
    @FXML
    private Label label;
    private String[] colors = {"#ecece6","#deded4","#cdcdc2","#FFFFFF","#000000"};
    private int currentColorIdx =0;
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        currentColorIdx++;
        if(currentColorIdx > 4){
            currentColorIdx = 0;
        }
        //TODO: You can do all sorts of stuff here
        BackgroundFill bgFill = new BackgroundFill(Paint.valueOf(colors[currentColorIdx]), CornerRadii.EMPTY, Insets.EMPTY);
        Background bg = new Background(bgFill);
        label.setBackground(bg);
        label.setText("Hello World!");
    }
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

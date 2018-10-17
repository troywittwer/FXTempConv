package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
  @FXML
  private TextField inputF;

  @FXML
  private Label outputC;

  @FXML
  void convert(ActionEvent event){

    double degreesF = Double.parseDouble(inputF.getText());
    double degreesC = degreesF * 9/5 + 32;
    outputC.setText(Double.toString(degreesC));
  }
}

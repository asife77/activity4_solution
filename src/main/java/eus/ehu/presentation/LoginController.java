package eus.ehu.presentation;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class LoginController {
    @FXML
    private Button myButton;

    @FXML
    private TextField loginField;

    @FXML
    private TextField pField;

    @FXML
    private Label messageLabel;

    @FXML
    private void handleButtonClick() {
        if (pField.getText().equals("123456") && loginField.getText().equals("admin")){
            messageLabel.setText("Correct!");
            messageLabel.setVisible(true);
            messageLabel.setStyle("-fx-background-color: #90EE90; -fx-text-fill: green; -fx-background-radius: 5; -fx-padding: 5 15;");
        } else {
            messageLabel.setText("Wrong. Try again");
            messageLabel.setVisible(true);
            messageLabel.setStyle("-fx-background-color: #FFB6C1; -fx-text-fill: red; -fx-background-radius: 5; -fx-padding: 5 15;");
        }
    }
}

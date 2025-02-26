package hmi.controller;

import java.sql.SQLException;

import hmi.model.UserDAO;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class UserController {

	@FXML
    private Button btnRegister;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton radioFemale;

    @FXML
    private RadioButton radioMale;

    @FXML
    private TextField txtDateOfBirth;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNrc;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtPhoneNumber;

    @FXML
    private TextField txtUsername;
	
	
	
	@FXML
	private void registerClick() throws SQLException {
		String username = null;
		String password = null;
		
		username = txtUsername.getText();
		password = txtPassword.getText();
		boolean status = UserDAO.checkCredential(username, password);
		if (!status) {
			Alert alert = new Alert(AlertType.ERROR, "Wrong Username and Password", ButtonType.OK);
			alert.show();
		}
		
	}
	
	
	
}

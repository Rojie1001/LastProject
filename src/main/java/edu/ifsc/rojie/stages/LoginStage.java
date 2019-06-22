package edu.ifsc.rojie.stages;

import edu.ifsc.rojie.ui.Strings;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

public class LoginStage {

	private JFXTextField txtUsername;
	private JFXPasswordField txtPassword;
	private JFXButton btnLogin;
	private JFXButton btnCadastro;
	private ImageView imgLogin;
	private ImageView imgPassword;
	
	
	public LoginStage(Stage stage) throws Exception {

		// Creating pane to login
		AnchorPane paneLogin = new AnchorPane();
		paneLogin.setPrefSize(350, 300);
		Scene scene = new Scene(paneLogin);
		stage.setScene(scene);

		// creating the username textfield
		txtUsername = new JFXTextField();
		txtUsername.setLayoutX(110);
		txtUsername.setLayoutY(80);
		txtUsername.setMaxWidth(150);
		txtUsername.setMinWidth(150);
		txtUsername.setPrefWidth(150);
		txtUsername.setPromptText(Strings.username);

		// creating the password textfield
		txtPassword = new JFXPasswordField();
		txtPassword.setLayoutX(110);
		txtPassword.setLayoutY(130);
		txtPassword.setMaxWidth(200);
		txtPassword.setMinWidth(150);
		txtPassword.setPrefWidth(150);
		txtPassword.setPromptText(Strings.password);

		// creating the login button
		btnLogin = new JFXButton(Strings.btnLogin);
		btnLogin.setLayoutX(110);
		btnLogin.setLayoutY(180);
		btnLogin.setMaxWidth(150);
		btnLogin.setMinWidth(150);
		btnLogin.setPrefWidth(150);
		
		//creating the cadastro button
		btnCadastro = new JFXButton(Strings.btnCadastro);
		btnCadastro.setLayoutX(110);
		btnCadastro.setLayoutY(220);
		btnCadastro.setMaxWidth(150);
		btnCadastro.setMinWidth(150);
		
		//creating image to Login
		imgLogin = new ImageView("file:///C:/Users/Usuario/eclipse-workspace/LastProject/src/main/java/edu/ifsc/rojie/stages/login.png");
		imgLogin.setLayoutX(83);
		imgLogin.setLayoutY(80);
		imgLogin.setFitHeight(25);
		imgLogin.setFitWidth(25);
		
		//creating image to Password
		imgPassword = new ImageView("file:///C:/Users/Usuario/eclipse-workspace/LastProject/src/main/java/edu/ifsc/rojie/stages/login.png");
		imgPassword.setLayoutX(83);
		imgPassword.setLayoutY(130);
		imgPassword.setFitHeight(25);
		imgPassword.setFitWidth(25);

		// adding all created components to the pane
		paneLogin.getChildren().add(btnLogin);
		paneLogin.getChildren().add(txtUsername);
		paneLogin.getChildren().add(txtPassword);
		paneLogin.getChildren().add(imgLogin);
		paneLogin.getChildren().add(imgPassword);
		paneLogin.getChildren().add(btnCadastro);


		// setting some stage (window) properties
		stage.setTitle(Strings.titleLogin);
		stage.setResizable(false);

		// showing the created UI
		stage.show();

	}

		// creating method Error java to LoginStage
		private void errorLogin() {
			Alert alertError = new Alert(AlertType.INFORMATION);
			alertError.setTitle(Strings.loginError);
			alertError.setHeaderText(Strings.reportingError);
			alertError.showAndWait();
	}
}

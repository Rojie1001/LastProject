package edu.ifsc.rojie.stages;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;


import edu.ifsc.rojie.db.AdminUser;
import edu.ifsc.rojie.db.SimpleUser;
import edu.ifsc.rojie.entities.User;
import edu.ifsc.rojie.exceptions.DBException;
import edu.ifsc.rojie.exceptions.LoginException;
import edu.ifsc.rojie.util.DB;
import edu.ifsc.rojie.util.Strings;

public class LoginStage {

	private JFXTextField txtUsername;
	private JFXPasswordField txtPassword;
	private JFXButton btnLogin;
	private JFXButton btnCadastro;
	private ImageView imgLogin;
	private ImageView imgPassword;
	private Label lblLogin;
	
	

	public LoginStage(Stage stage) throws Exception {

		// Creating pane to login
		AnchorPane paneLogin = new AnchorPane();
		paneLogin.setPrefSize(350, 300);
		Scene scene = new Scene(paneLogin);
		stage.setScene(scene);

		//creating Label 
		lblLogin = new Label();
		lblLogin.setLayoutX(160);
		lblLogin.setLayoutY(50);
		lblLogin.setMaxHeight(200);
		lblLogin.setMinWidth(200);
		lblLogin.setPrefWidth(150);
		lblLogin.setText(Strings.lblLogin);
		
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

		// creating the cadastro button
		btnCadastro = new JFXButton(Strings.btnCadastro);
		btnCadastro.setLayoutX(110);
		btnCadastro.setLayoutY(220);
		btnCadastro.setMaxWidth(150);
		btnCadastro.setMinWidth(150);

		// creating image to Login
		imgLogin = new ImageView(
				"file:///C:/Users/Usuario/eclipse-workspace/LastProject/src/main/java/edu/ifsc/rojie/stages/login.png");
		imgLogin.setLayoutX(80);
		imgLogin.setLayoutY(80);
		imgLogin.setFitHeight(30);
		imgLogin.setFitWidth(30);

		// creating image to Password
		imgPassword = new ImageView(
				"file:///C:/Users/Usuario/eclipse-workspace/LastProject/src/main/java/edu/ifsc/rojie/stages/senha.jpg");
		imgPassword.setLayoutX(80);
		imgPassword.setLayoutY(130);
		imgPassword.setFitHeight(30);
		imgPassword.setFitWidth(30);
		
		btnLogin.setOnMouseClicked(e -> {
			try {
				login(txtUsername.getText(), txtPassword.getText(), stage);
			} catch (LoginException ex) {
				System.out.println(ex.getMessage());
			} catch (DBException ex2) {

			}
		});


		// adding all created components to the pane
		paneLogin.getChildren().add(btnLogin);
		paneLogin.getChildren().add(txtUsername);
		paneLogin.getChildren().add(txtPassword);
		paneLogin.getChildren().add(imgLogin);
		paneLogin.getChildren().add(imgPassword);
		paneLogin.getChildren().add(btnCadastro);
		paneLogin.getChildren().add(lblLogin);
		

		// setting some stage (window) properties
		stage.setTitle(Strings.titleLogin);
		stage.setResizable(false);

		// showing the created UI
		stage.show();
		

	}
	private void changeDB(String selectedItem) {
		if (selectedItem.equals("JSON"))
			DB.usersAdm = new AdminUser();
		else if (selectedItem.equals("XML"))
			DB.usersAdm = new SimpleUser();
	}

	private void changeDB() {
		if (DB.usersAdm instanceof AdminUser)
			DB.usersAdm  = new SimpleUser();
		else if (DB.usersAdm  instanceof SimpleUser)
			DB.usersAdm  = new AdminUser();
	}

	private void login(String username, String pass, Stage stage) throws LoginException, DBException {

		try {
			withCurrentDB(username, pass, stage);
		} catch (DBException exception) {
			changeDB();
			try {
				withCurrentDB(username, pass, stage);
			} catch (DBException newException) {
				throw new LoginException();
			}
		}
	}
	private void withCurrentDB(String username, String pass, Stage stage) throws DBException {
		User user = DB.usersAdm.getUser(username);
		try {
			if (!user.getPass().equals(pass)) {
				LoginError();
				return;
			}
		} catch (NullPointerException ex) {
			throw new DBException();
		}
		try {
			new MainStage(new Stage(), txtUsername.getText());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// creating method Error java to LoginStage
	private void LoginError() {
		Alert alertError = new Alert(AlertType.INFORMATION);
		alertError.setTitle(Strings.loginError);
		alertError.setHeaderText(Strings.reportingError);
		alertError.showAndWait();
	}
}

package edu.ifsc.rojie.stages;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import edu.ifsc.rojie.db.*;
import edu.ifsc.rojie.util.Strings;
public class RegisterStage {

	private Label name;
	private Label password;
	private JFXTextField username;
	private JFXPasswordField newPassword;
	
	
	public RegisterStage(Stage stage) throws Exception{
		
		AnchorPane paneRegister =  new AnchorPane();
		paneRegister.setPrefSize(300, 350);
		Scene scene = new Scene(paneRegister);
		stage.setScene(scene);
		
		//creating Label name
		name = new Label();
		name.setLayoutX(110);
		name.setLayoutY(150);
		name.setMaxHeight(200);
		name.setMinWidth(200);
		name.setPrefWidth(150);
		name.setText(Strings.name);
		
	}
}

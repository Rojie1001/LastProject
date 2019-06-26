package edu.ifsc.rojie.stages;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class BanStage {
	public BanStage(Stage stage) {
		AnchorPane paneHouses = new AnchorPane();
		paneHouses.setPrefSize(900, 900);
		Scene scene = new Scene(paneHouses);
		stage.setScene(scene);
		
		stage.setTitle("Projects");
		stage.setFullScreen(true);
		stage.setResizable(false);

		// showing the created UI
		stage.show();
	}
}

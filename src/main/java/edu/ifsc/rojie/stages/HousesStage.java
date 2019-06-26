package edu.ifsc.rojie.stages;

import edu.ifsc.rojie.util.Strings;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HousesStage {
	
	private ImageView imgCabesss;
 
	public void Projects(Stage stage) throws Exception{
		
		//creating Pane
		AnchorPane paneHouses = new AnchorPane();
		paneHouses.setPrefSize(900, 900);
		Scene scene = new Scene(paneHouses);
		stage.setScene(scene);
		
		imgCabesss = new ImageView("file:///C:/Users/Usuario/eclipse-workspace/LastProject/src/main/java/edu/ifsc/rojie/stages/imgProjetos.png");
		imgCabesss.setLayoutX(1);
		imgCabesss.setLayoutY(100);
		imgCabesss.setFitHeight(250);
		imgCabesss.setFitWidth(390);
		
		paneHouses.getChildren().addAll(imgCabesss);
		
		// setting some stage (window) properties
				stage.setTitle("Projects");
				stage.setFullScreen(true);
				stage.setResizable(false);

				// showing the created UI
				stage.show();
		
		
	}
}

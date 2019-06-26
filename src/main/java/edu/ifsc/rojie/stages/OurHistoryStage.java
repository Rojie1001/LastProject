package edu.ifsc.rojie.stages;

import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class OurHistoryStage {
	
	private Media media = new Media("https://www.youtube.com/watch?v=SdkWBHLHTgg&list=RDMF5Vj2X4s3Q&index=23"); // 1
	private MediaPlayer mediaPlayer = new MediaPlayer(media); // 2
	private MediaView mediaView = new MediaView(mediaPlayer); // 3
	
	public void OurHistoryStage(Stage stage) {
		AnchorPane paneHouses = new AnchorPane();
		paneHouses.setPrefSize(900, 900);
		paneHouses.getChildren().add(mediaView); // 4
		Scene scene = new Scene(paneHouses);
		stage.setScene(scene);
		

		stage.setTitle("Projects");
		stage.setFullScreen(true);
		stage.setResizable(false);

		// showing the created UI
		stage.show();
		mediaPlayer.play(); // 4
	}
}

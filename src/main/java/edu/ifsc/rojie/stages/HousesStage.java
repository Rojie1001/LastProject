package edu.ifsc.rojie.stages;

import com.jfoenix.controls.JFXButton;

import edu.ifsc.rojie.util.Strings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HousesStage {

	private ImageView imgCabesss;
	private JFXButton btnSubmit;

	// creating combobox
	ObservableList<String> options = FXCollections.observableArrayList("2 Pavimentos", "2 ou mais banheiros",
			"Terreno acima de 300m²");
	final ComboBox combobox = new ComboBox(options);

	// defining option choicied
	public void Choice(Stage stage) {
		if (combobox.getSelectionModel().getSelectedItem() == "2 Pavimentos") {
			new PavStage(new Stage());
			stage.close();
		} else if (combobox.getSelectionModel().getSelectedItem() == "2 ou mais banheiros") {
			new BanStage(new Stage());
			stage.close();
		}
		if (combobox.getSelectionModel().getSelectedItem() == "Terreno acima de 300m²") {
			new TerStage(new Stage());
			stage.close();
		}

	}

	public void Projects(Stage stage) throws Exception {

		// creating Pane
		AnchorPane paneHouses = new AnchorPane();
		paneHouses.setPrefSize(900, 900);
		Scene scene = new Scene(paneHouses);
		stage.setScene(scene);

		// creating image top
		imgCabesss = new ImageView(
				"file:///C:/Users/Usuario/eclipse-workspace/LastProject/src/main/java/edu/ifsc/rojie/stages/imgProjetos.png");
		imgCabesss.setLayoutX(0);
		imgCabesss.setLayoutY(0);
		imgCabesss.setFitHeight(180);
		imgCabesss.setFitWidth(1400);

		// creating combobox
		combobox.setLayoutX(0);
		combobox.setLayoutY(180);
		combobox.setPromptText(Strings.txtcombo);

		// creating btnSubmit
		btnSubmit = new JFXButton();
		btnSubmit.setLayoutX(180);
		btnSubmit.setLayoutY(180);
		btnSubmit.setMaxWidth(50);
		btnSubmit.setMinWidth(50);
		btnSubmit.setPrefWidth(50);
		btnSubmit.setText(Strings.btnSubmit);
		btnSubmit.setStyle("-fx-background-color: #666; ");

		// inserts components in paneHouses
		paneHouses.getChildren().addAll(imgCabesss, combobox, btnSubmit);

		// setting some stage (window) properties
		stage.setTitle("Projects");
		stage.setFullScreen(true);
		stage.setResizable(false);

		// showing the created UI
		stage.show();

		btnSubmit.setOnAction(e -> {
			Choice(stage);

		});

	}
}

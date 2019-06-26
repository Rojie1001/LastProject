package edu.ifsc.rojie.stages;

import javafx.scene.Scene;

import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import com.jfoenix.controls.JFXButton;
import edu.ifsc.rojie.util.Strings;

public class Main {

	private JFXButton btnHome;
	private JFXButton btnHouses;
	private JFXButton btnOurHistory;
	private JFXButton btnRequests;
	private JFXButton btnContact;
	private JFXButton btnLogout;

	private ImageView imgLogout;
	private ImageView imgCasa1;
	private ImageView imgCasa2;
	private ImageView imgCasa3;
	private ImageView imgWelcome;

	private Label mainLabel;
	private Label info01;
	private Label info02;
	private Label info03;

	// Method that go HousesStage
	public void goHousesStage(Stage stage) {
		try {
			new HousesStage().Projects(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Method that back LoginStage
	public void goLoginStage(Stage stage) {
		try {
			new LoginStage(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//
	public void goOurHistory(Stage stage) {
		try {
			new OurHistoryStage().OurHistoryStage(new Stage());
			stage.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Main(Stage stage) throws Exception {

		// creating pane to MainStage
		AnchorPane paneMain = new AnchorPane();
		paneMain.setPrefSize(900, 900);

		Scene scene = new Scene(paneMain);
		stage.setScene(scene);

		//

		// Creating button Home
		btnHome = new JFXButton(Strings.home);
		btnHome.setLayoutX(70);
		btnHome.setLayoutY(20);
		btnHome.setMaxWidth(200);
		btnHome.setMinWidth(200);
		btnHome.setPrefWidth(200);
		btnHome.setStyle("-fx-background-color: #666; ");

		// creating button Houses
		btnHouses = new JFXButton(Strings.houses);
		btnHouses.setLayoutX(290);
		btnHouses.setLayoutY(20);
		btnHouses.setMaxWidth(200);
		btnHouses.setMinWidth(200);
		btnHouses.setPrefWidth(200);
		btnHouses.setStyle("-fx-background-color: #666; ");

		// Creating button OurHistory
		btnOurHistory = new JFXButton(Strings.ourHistory);
		btnOurHistory.setLayoutX(500);
		btnOurHistory.setLayoutY(20);
		btnOurHistory.setMaxWidth(200);
		btnOurHistory.setMinWidth(200);
		btnOurHistory.setPrefWidth(200);
		btnOurHistory.setStyle("-fx-background-color: #666; ");

		// Creating button Requests
		btnRequests = new JFXButton(Strings.requests);
		btnRequests.setLayoutX(710);
		btnRequests.setLayoutY(20);
		btnRequests.setMaxWidth(200);
		btnRequests.setMinWidth(200);
		btnRequests.setPrefWidth(200);
		btnRequests.setStyle("-fx-background-color: #666; ");

		// Creating button Contact
		btnContact = new JFXButton(Strings.contact);
		btnContact.setLayoutX(920);
		btnContact.setLayoutY(20);
		btnContact.setMaxWidth(200);
		btnContact.setMinWidth(200);
		btnContact.setPrefWidth(200);
		btnContact.setStyle("-fx-background-color: #666; ");

		// Creating button Home
		btnLogout = new JFXButton(Strings.logout);
		btnLogout.setLayoutX(1200);
		btnLogout.setLayoutY(20);
		btnLogout.setMaxWidth(100);
		btnLogout.setMinWidth(100);
		btnLogout.setPrefWidth(100);
		btnLogout.setStyle("-fx-background-color: #666; ");

		// creating image to logout
		imgLogout = new ImageView(
				"file:///C:/Users/Usuario/eclipse-workspace/LastProject/src/main/java/edu/ifsc/rojie/stages/login.png");
		imgLogout.setLayoutX(1200);
		imgLogout.setLayoutY(20);
		imgLogout.setFitHeight(25);
		imgLogout.setFitWidth(23);

		// creating image of houses
		imgCasa1 = new ImageView(
				"file:///C:/Users/Usuario/eclipse-workspace/LastProject/src/main/java/edu/ifsc/rojie/stages/casa%201.jpeg");
		imgCasa1.setLayoutX(70);
		imgCasa1.setLayoutY(100);
		imgCasa1.setFitHeight(250);
		imgCasa1.setFitWidth(390);

		imgCasa2 = new ImageView(
				"file:///C:/Users/Usuario/eclipse-workspace/LastProject/src/main/java/edu/ifsc/rojie/stages/casa%202.jpg");
		imgCasa2.setLayoutX(480);
		imgCasa2.setLayoutY(100);
		imgCasa2.setFitHeight(250);
		imgCasa2.setFitWidth(390);

		imgCasa3 = new ImageView(
				"file:///C:/Users/Usuario/eclipse-workspace/LastProject/src/main/java/edu/ifsc/rojie/stages/casa%203.jpeg");
		imgCasa3.setLayoutX(890);
		imgCasa3.setLayoutY(100);
		imgCasa3.setFitHeight(250);
		imgCasa3.setFitWidth(390);

		imgWelcome = new ImageView(
				"file:///C:/Users/Usuario/eclipse-workspace/LastProject/src/main/java/edu/ifsc/rojie/stages/welcome.png");

		// Creating Label with informations about of houses
		info01 = new Label();
		info01.setLayoutX(70);
		info01.setLayoutY(350);
		info01.setMaxHeight(200);
		info01.setMinWidth(200);
		info01.setPrefWidth(200);
		info01.setFont(new Font("Arial Black", 18));
		info01.setText(Strings.info01);

		info02 = new Label();
		info02.setLayoutX(480);
		info02.setLayoutY(350);
		info02.setMaxHeight(200);
		info02.setMinWidth(200);
		info02.setPrefWidth(200);
		info02.setFont(new Font("Arial Black", 18));
		info02.setText(Strings.info02);

		info03 = new Label();
		info03.setLayoutX(890);
		info03.setLayoutY(350);
		info03.setMaxHeight(200);
		info03.setMinWidth(200);
		info03.setPrefWidth(200);
		info03.setFont(new Font("Arial Black", 18));
		info03.setText(Strings.info03);

		mainLabel = new Label();
		mainLabel.setLayoutX(70);
		mainLabel.setLayoutY(370);
		mainLabel.setMaxHeight(200);
		mainLabel.setMinWidth(200);
		mainLabel.setPrefWidth(1280);
		mainLabel.setGraphic(imgWelcome);

		// inserting components in paneMain
		paneMain.getChildren().addAll(btnHome, btnHouses, btnOurHistory, btnRequests, btnContact, btnLogout);
		paneMain.getChildren().addAll(imgLogout, imgCasa1, imgCasa2, imgCasa3);
		paneMain.getChildren().addAll(info01, info02, info03, mainLabel);

		// setting some stage (window) properties
		stage.setTitle(Strings.titleMain);
		stage.setFullScreen(true);
		stage.setResizable(false);

		// showing the created UI
		stage.show();

		// passing Stages with lambda expressions
		btnHouses.setOnAction(e -> {
			goHousesStage(stage);

		});


		btnOurHistory.setOnAction(e -> {
			goOurHistory(stage);

		});

	}
}

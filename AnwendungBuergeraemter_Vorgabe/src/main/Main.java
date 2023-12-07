package main;


import gui.guiBuergeraemter.BuergeraemterControl;
import gui.guiStaeditischeEinrichtungen.StaedtischeEinrichtungenControl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	public void start(Stage primaryStage) {
		new BuergeraemterControl(primaryStage);
		Stage fensterStaedtischeEinrichtung = new Stage ();
		new StaedtischeEinrichtungenControl(fensterStaedtischeEinrichtung);
	}	
	
	public static void main(String[] args){
		launch(args);
	}

}

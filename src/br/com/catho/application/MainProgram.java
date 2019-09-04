package br.com.catho.application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainProgram extends Application{

	private static Stage stage;
	
	@Override public void start(Stage stage){
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("../view/Menu.fxml"));
			Scene scene = new Scene(parent);
			setStage(stage);
			stage.setScene(scene);
			stage.setResizable(false);
			stage.setTitle("Menu");
			stage.show();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	public static Stage getStage() {
		return MainProgram.stage;
	}
	
	public static void setStage(Stage stage) {
		MainProgram.stage = stage;
	}
	public static void close() {
		MainProgram.getStage().close();
	}
}
ControllerMainPage.java
package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

public class ControllerMainPage {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void EnterStart(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/LevelSelection.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void EnterInstructions(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/Instructions.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	/*public void EnterHighscore(ActionEvent event) throws IOException {
		
		Parent root = FXMLLoader.load(getClass().getResource("/Highscore.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}*/

}

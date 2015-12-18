
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.*;
 
public class MainMenuSceneController {
	
	@FXML private Button exitGameButton;
	
	@FXML
	public void handleExitGameButtonAction(ActionEvent event) {
		Stage stage = (Stage) exitGameButton.getScene().getWindow();
	    stage.close();
	}

}

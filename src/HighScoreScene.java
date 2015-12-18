
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.*;

public class HighScoreScene extends Scene {
	
	Pane root;
	Button toMainMenu;
	
	public HighScoreScene(Pane r) {
		super(r);
		root = r;
	}
	
	public HighScoreScene(Pane r, double x, double y) {
		super(r, x, y);
		root = r;
		
		toMainMenu = new Button("Return to Menu");
		toMainMenu.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Returning to main menu");
				root = new Pane();
				Stage stage = (Stage) toMainMenu.getScene().getWindow();
				stage.setScene(new MainMenuScene(root, x, y));
			}
		});
		toMainMenu.setLayoutX(x/2);
		toMainMenu.setLayoutY(y/2);
		root.getChildren().add(toMainMenu);
	}
}

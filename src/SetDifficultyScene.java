
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.text.*;

public class SetDifficultyScene extends Scene {
	
	Pane root;
	Button toMainMenu;
	
	public SetDifficultyScene(Pane r) {
		super(r);
		root = r;
	}
	
	public SetDifficultyScene(Pane r, double x, double y) {
		super(r, x, y);
		root = r;
		
		Text title = new Text(x/4, 20, "Set Difficulty");
		root.getChildren().add(title);
		
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

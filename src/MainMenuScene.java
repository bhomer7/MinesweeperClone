
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class MainMenuScene extends Scene{
	
	Button newGame;
	Button highScores;
	Button setDifficulty;
	Button exitGame;
	Pane root;
	
	public MainMenuScene(Pane r) {
		super(r);
		root = r;
	}
	
	public MainMenuScene(Pane r, double x, double y) {
		super(r, x, y);
		root = r;
		root.getChildren().clear();
		
		newGame = new Button("New Game");
		newGame.setOnAction(new EventHandler<ActionEvent>() { 
			@Override
			public void handle(ActionEvent event) {
				System.out.println("NEW GAME");
			}
		});
		newGame.setLayoutX(x/2);
		newGame.setLayoutY(30);
		root.getChildren().add(newGame);
		
		highScores = new Button("High Scores");
		highScores.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("HIGH SCORES");
				root = new Pane();
				Stage stage = (Stage) setDifficulty.getScene().getWindow();
				stage.setScene(new HighScoreScene(root, x, y));
//				stage.show();
			}
		});
		highScores.setLayoutX(x/2);
		highScores.setLayoutY(60);
		root.getChildren().add(highScores);
		
		setDifficulty = new Button("Set Difficulty");
		setDifficulty.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("SET DIFFICULTY");
				root = new Pane();
				Stage stage = (Stage) setDifficulty.getScene().getWindow();
				stage.setScene(new SetDifficultyScene(root, x, y));
//				stage.show();
			}
		});
		setDifficulty.setLayoutX(x/2);
		setDifficulty.setLayoutY(90);
		root.getChildren().add(setDifficulty);
		
		exitGame = new Button("Exit Game");
		exitGame.setText("Exit Game");
		exitGame.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("EXIT GAME");
				Stage stage = (Stage) exitGame.getScene().getWindow();
			    stage.close();
			    System.out.println("GAME CLOSED");
			}
		});
		exitGame.setLayoutX(x/2);
		exitGame.setLayoutY(120);
		root.getChildren().add(exitGame);
		
		
//		Button[] buttons = new Button[MainMenuOptions.values().length];
//		for(int i = 0; i < buttons.length; i++) {
//			buttons[i] = new Button();
//			buttons[i].setText(MainMenuOptions.values()[i].text());
//			buttons[i].setOnAction(MainMenuOptions.values()[i].eventHandler());
//			buttons[i].setLayoutX(x/2);
//			buttons[i].setLayoutY(30*i);
//			root.getChildren().add(buttons[i]);
//		}
		
	}

}

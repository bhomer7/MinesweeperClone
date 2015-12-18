
import java.io.IOException;

import javafx.application.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.*;

public class MinesweeperClone extends Application{
	
	private Board board;
	
	public void start(Stage stage) throws IOException {
		
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MainMenuScene.fxml"));
		
		BorderPane root = (BorderPane) loader.load();
	    
        Scene scene = new Scene(root, 300, 275);
    
        stage.setTitle("Minesweeper Clone");
        stage.setScene(scene);
        stage.show();
//		int windowSizeX = 600;
//		int windowSizeY = 600;
//		
//		Button btn = new Button();
//		btn.setText("Say 'Hello World'");
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("Hello World!");
//			}
//		});
//      
//		Pane root = new Pane();
////		final Canvas canvas = new Canvas(windowSizeX, windowSizeY);
////		GraphicsContext gc = canvas.getGraphicsContext2D();
////		root.getChildren().add(canvas);
////		root.getChildren().add(btn);
//
////		Scene scene = new Scene(root, windowSizeX, windowSizeY);
//
//		primaryStage.setTitle("Minesweeper Clone");
//		primaryStage.setResizable(false);
//		primaryStage.setScene(new MainMenuScene(root, windowSizeX, windowSizeY));
//		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}

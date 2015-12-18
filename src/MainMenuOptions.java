
import javafx.event.*;

public enum MainMenuOptions {
	MENU_OPTION_NEW_GAME ("New Game", new EventHandler<ActionEvent>() { 
		@Override
		public void handle(ActionEvent event) {
			System.out.println("NEW GAME");
		}
	}),
	MENU_OPTION_HIGH_SCORES ("High Scores", new EventHandler<ActionEvent>() { 
		@Override
		public void handle(ActionEvent event) {
			System.out.println("HIGH SCORES");
		}
	}),
	MENU_OPTION_SET_DIFFICULTY ("Set Difficulty", new EventHandler<ActionEvent>() { 
		@Override
		public void handle(ActionEvent event) {
			System.out.println("SET DIFFICULTY");
		}
	}),
	MENU_OPTION_EXIT_GAME ("Exit Game", new EventHandler<ActionEvent>() { 
		@Override
		public void handle(ActionEvent event) {
			System.out.println("EXIT GAME");
//			Stage stage = (Stage) 
		}
	});
	
	private final String text;
	private final EventHandler<ActionEvent> eventHandler;
	
	private MainMenuOptions(String t, EventHandler<ActionEvent> handler) {
		this.text = t;
		this.eventHandler = handler;
	}
	
	public String text() { return text; }
	
	public EventHandler<ActionEvent> eventHandler() { return eventHandler; }
	
	public String toString() { return text; }

}
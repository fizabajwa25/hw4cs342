import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// Template Method pattern demo
public class TemplateMethodDemo extends Application {

	@Override
	public void start(Stage primaryStage) {
		// Create a button
		Button button = new Button("Click Me");

		// Create a stack pane and add the button to it
		StackPane root = new StackPane();
		root.getChildren().add(button);

		// Create a scene with the stack pane
		Scene scene = new Scene(root, 300, 250);

		// Set the scene to the primary stage
		primaryStage.setScene(scene);
		primaryStage.setTitle("Template Method Pattern Demo");
		primaryStage.show();

		// Add an action listener to the button
		button.setOnAction(event -> {
			// Call the template method
			performAction(button);
		});
	}

	// Template method that defines the algorithm
	private void performAction(Button button) {
		// Call the abstract method
		step1(button);

		// Call the concrete method
		step2();
	}

	// Abstract method to be implemented by subclasses
	private void step1(Button button) {
		// Change the background color of the button
		button.setStyle("-fx-background-color: lightblue;");
		System.out.println("Step 1: Button background color changed.");
	}

	// Concrete method with a default implementation
	private void step2() {
		System.out.println("Step 2: Action performed successfully.");
	}

	public static void main(String[] args) {
		launch(args);
	}
}

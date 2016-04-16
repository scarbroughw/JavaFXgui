import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;

 
public class JavaFXDemo extends Application {
    public static void main(String[] args){
    	launch(args);    	
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	// This sets the title of the application window
    	primaryStage.setTitle("RapidClick Games");
    	
    	// Creates a button
    	Button click = new Button("Click me rapidly");
    	
    	
    	StackPane root = new StackPane();
    	
    	root.getChildren().add(click);
    	
    	// The 'scene' is the part of the application that show up with content inside of the window
    	Scene scene = new Scene(root,600,400);
    	
    	// This sets and shows the scene.  All necessary functions of JavaFX
    	primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}


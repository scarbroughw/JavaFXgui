import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.Scene;

/**
 *  @author Bill Scarbrough
 *	Edits 4/16/16
 *	This edit makes two buttons. One button gets clicked a number of times.	
 *	The other button display how many times the other has been clicked.
 *	If the first button is clicked less than 100 times, it displays one message.
 *	If the first button is clicked over 100 times, it displays another.
 *	*Note* The first button is behind the second button.
 *	
 *	***The problem I am having is the buttons overlay each other***
 * 
 */
public class JavaFXDemo extends Application {
	public int total = 0;
    public static void main(String[] args){
    	launch(args);
    	
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception{
    	
    	int counter=0;
    	
    	// This sets the title of the application window
    	primaryStage.setTitle("RapidClick Games");
    	
    	
    	// Creates a button
    	Button click = new Button("Click me rapidly");
    	Button show = new Button("Show Clicks");
    	
    	// This is what happens on click event for the first button
    	click.setOnAction(new EventHandler<ActionEvent>() {
    	
            @Override
            public void handle(ActionEvent event) {
            	
            	// Event calls method Counter and stores the incrementing variable in total
                total = counter(total);
            }
        });
    	
    	// This is what happens on click event for the second button
    	show.setOnAction(new EventHandler<ActionEvent>(){
    		public void handle(ActionEvent event){
    			System.out.println("You've clicked the button "+total+" times!");
    			if(total>=100){
    				System.out.println("\nCongrats! You're a true RapidClick Gamer!");
    			}
    			else
    				System.out.println("Keep clicking you pussy.  You're not done yet!!");
    		}
    		
    	});
    	
    	StackPane root = new StackPane();
    	
    	root.getChildren().add(click);
    	root.getChildren().add(show);
    	// The 'scene' is the part of the application that show up with content inside of the window
    	Scene scene = new Scene(root,600,400);
    	
    	// This sets and shows the scene.  All necessary functions of JavaFX
    	primaryStage.setScene(scene);
        primaryStage.show();
        
        
    }
    
    // Method Counter adds one to int counter each time it is called
    public int counter(int counter){
    	counter++;
    	return counter;
    }
}


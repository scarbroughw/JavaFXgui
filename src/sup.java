import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class sup extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
		Button btn = new Button();
		Group root = new Group();
		
		Text txt = new Text("sup");
		txt.setFont(new Font("Papyrus",80));
		Label label = new Label("Name: ");
		TextField nameFld = new TextField();
		GridPane grid = new GridPane();
		grid.add(label, 0, 0);
		grid.add(nameFld, 1, 0);
		grid.setHgap(20);
		grid.add(btn,1,1);
		
		// Line below makes grid lines visible 
		//grid.setGridLinesVisible(true);
		
		btn.setText("Say Sup!");
		
		// When button is clicked, the event (evt) points to the action it will take
		btn.setOnAction(evt -> System.out.printf("Sup %s!%n",nameFld.getText()));
		
		txt.setY(150);
		txt.setX(150);
		
		VBox box = new VBox();
		box.getChildren().addAll(txt,grid);
		root.getChildren().add(box);
		primaryStage.setTitle("Sup");
		primaryStage.setScene(new Scene(root,300,275));
		primaryStage.show();	
		
	}
	
	public static void main(String[] args){
		launch(args);
			
	}
}

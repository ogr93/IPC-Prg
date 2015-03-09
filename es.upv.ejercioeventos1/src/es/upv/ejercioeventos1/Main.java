package es.upv.ejercioeventos1;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	double x, y;
	
	@Override
	public void start(Stage primaryStage) 
	{
		try {
			GridPane root = (GridPane)FXMLLoader.load(getClass().getResource("layout.fxml"));
			Scene scene = new Scene(root);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Titulo exterior");
			//Cambiar la propiedad a trasparente
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			
			scene.setOnMouseClicked((e)->{
				primaryStage.setOpacity(0.5);
			});
			
			scene.setOnMousePressed((e)->{
				x= primaryStage.getX() - e.getScreenX();
				y= primaryStage.getY() - e.getScreenY();
				
			});
			
			scene.setOnMouseDragged((e)->{
				primaryStage.setX(e.getScreenX() + x);
				primaryStage.setY(e.getScreenY() + y);
				//primaryStage.setOpacity(1);
			});
			
			primaryStage.show();
		    }
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

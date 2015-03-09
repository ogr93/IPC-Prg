package menus;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controladores {
    
	
	@FXML
	private void imprimir(ActionEvent e) {
	System.out.println("Imprimir");
	}
//*************DIALOGOS***************************//	
	@FXML
	            public void handle(ActionEvent event) {
	                final Stage dialog = new Stage();
	                dialog.initModality(Modality.APPLICATION_MODAL);
	                dialog.initOwner(dialog);
	                VBox dialogVbox = new VBox(20);
	                dialogVbox.getChildren().add(new Text("This is a Dialog"));
	                Scene dialogScene = new Scene(dialogVbox, 300, 200);
	                dialog.setScene(dialogScene);
	                dialog.show();
	            };
	    }
	

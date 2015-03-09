package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class floginControlador {
	
	@FXML
	GridPane gp;
	@FXML
	Button boton;
	@FXML
	void cambiar(ActionEvent e){
		if (gp.isGridLinesVisible())
			gp.setGridLinesVisible(false);
		else
			gp.setGridLinesVisible(true);
		
	}
}

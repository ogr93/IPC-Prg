package es.upv.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class LoginControlador {
	@FXML
	private Text mensaje_usuario;
	
	@FXML
	protected void pulsadoiniciar(ActionEvent event){
mensaje_usuario.setText("Boton iniciar pulsado");}

}

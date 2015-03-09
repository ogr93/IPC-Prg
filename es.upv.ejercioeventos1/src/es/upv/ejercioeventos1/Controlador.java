package es.upv.ejercioeventos1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;

	public class Controlador {
		@FXML
		private GridPane g1;
		@FXML
		private GridPane gp;
		@FXML
		private Button boton;
		@FXML
		private Button cerrar;
		@FXML
	protected void botonclose(ActionEvent key){
		Platform.exit();		
	}
	@FXML
	protected void botonMove(KeyEvent key) {
			final int x = gp.getColumnIndex(boton);
			final int y = gp.getRowIndex(boton);
			switch(key.getCode()){
			case W:
			case UP:
				if(y>0){
					gp.setRowIndex(boton, y-1);
					break;}
				else{
					gp.setRowIndex(boton, 4);
				break;}
			case S:
			case DOWN:
				if(y<4){
					gp.setRowIndex(boton, y+1);}
				else{
					gp.setRowIndex(boton, 0);}
				break;
			case A:
			case LEFT:
				if(x>0){
					gp.setColumnIndex(boton, x-1);}
				else{
					gp.setColumnIndex(boton, 4);}
				break;
			case D:
			case RIGHT:
				if(x<4){
					gp.setColumnIndex(boton, x+1);}
				else{
					gp.setColumnIndex(boton, 0);}
				break;
			case ENTER:
				gp.setRowIndex(boton, (int) (Math.random()*5));
				gp.setColumnIndex(boton, (int) (Math.random()*5));
				break;
			}			
		}
}

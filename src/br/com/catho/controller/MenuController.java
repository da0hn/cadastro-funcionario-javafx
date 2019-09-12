package br.com.catho.controller;

import java.net.URL;
import java.util.ResourceBundle;

import br.com.catho.application.Alterar;
import br.com.catho.application.Cadastro;
import br.com.catho.application.Excluir;
import br.com.catho.application.ListarTodos;
import br.com.catho.application.MainProgram;
import br.com.catho.util.ButtonOnAction;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuController implements Initializable{

	@FXML private Button btCadastro;
	@FXML private Button btEcluir;
	@FXML private Button btAlterar;
	@FXML private Button btListarTodos;
	@FXML private Button btNumeroDeFuncionarios;
	@FXML private Button btSair;
	
	private static Alterar alterar = new Alterar();
	private static Cadastro cadastro = new Cadastro();
	private static Excluir excluir = new Excluir();
	private static ListarTodos listar = new ListarTodos();
	
	
	@Override public void initialize(URL arg0, ResourceBundle arg1) {}
	
	
	@FXML void btAlterarOnClicked(MouseEvent event) {
		
		alterar.start( new Stage() );
		MainProgram.close();
	}
	
	@FXML void btCadastroOnClicked(MouseEvent event) {	
		cadastro.start(new Stage());
		MainProgram.close();
		
	}
	
	@FXML void btExcluirOnClicked(MouseEvent event) {
		excluir.start(new Stage());
		MainProgram.close();
	}
	
	@FXML void btListarTodosOnClicked(MouseEvent event) {
		listar.start(new Stage());
		//MainProgram.close();
	}
	
	@FXML void btNumeroDeFuncionariosOnClicked(MouseEvent event) {
		
	}
	
	@FXML void btSairOnClicked(MouseEvent event) {
		MainProgram.close();
	}
	
	@FXML void btAlterarOnKeyPressed(KeyEvent event) {
		if( ButtonOnAction.hasUserConfirmed(event) ) {
			alterar.start( new Stage() );
		}
	}
	
	@FXML void btCadastroOnKeyPressed(KeyEvent event) { 
		if( ButtonOnAction.hasUserConfirmed(event) ) {
			cadastro.start( new Stage() );
		}
	}
	
	@FXML void btExcluirOnKeyPressed(KeyEvent event) {
		if( ButtonOnAction.hasUserConfirmed(event) ) {
			excluir.start( new Stage() );
		}
	}
	
	@FXML void btListarTodosOnKeyPressed(KeyEvent event) {
		if( ButtonOnAction.hasUserConfirmed(event) ) {
			listar.start(new Stage());
		}
		//MainProgram.close();
	}
	
	@FXML void btSairOnKeyPressed(KeyEvent event) {
		if( ButtonOnAction.hasUserConfirmed(event) ) {
			MainProgram.close();
		}
	}
	
}

package it.polito.tdp.anagrammi.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.tdp.anagrammi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AnagrammiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtAnagrammi;

    @FXML
    private TextArea txtAnagrammiCorretti;

    @FXML
    private TextArea txtAnagrammiErratti;

	private Model model;

    @FXML
    void doCalcolaAnagrammi(ActionEvent event) {
      String parola = txtAnagrammi.getText();
      if (parola =="" || parola ==null) {
    	  txtAnagrammiCorretti.appendText("inserire una parola");
      }
      
      
    }

    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert txtAnagrammi != null : "fx:id=\"txtAnagrammi\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtAnagrammiCorretti != null : "fx:id=\"txtAnagrammiCorretti\" was not injected: check your FXML file 'Anagrammi.fxml'.";
        assert txtAnagrammiErratti != null : "fx:id=\"txtAnagrammiErratti\" was not injected: check your FXML file 'Anagrammi.fxml'.";

    }

	public void setModel(Model model) {
		this.model = model;
		
	}
}



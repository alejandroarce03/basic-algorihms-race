package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import model.Race;

public class RaceGUI {
	
	private Race race;
	
	public RaceGUI() {
		race = new Race();
	}
	    @FXML
	    private Circle circleOne;

	    @FXML
	    private TextField txtNumber;

	    @FXML
	    private RadioButton radAdd;

	    @FXML
	    private ToggleGroup algorithm;

	    @FXML
	    private RadioButton radSearch;

	    @FXML
	    private RadioButton radDelete;

	    @FXML
	    private RadioButton radIterative;

	    @FXML
	    private RadioButton radRecursive;

	    @FXML
	    private Circle circleTwo;

	    @FXML
	    private ImageView imgArrayList;

	    @FXML
	    private ImageView imgLinkedList;

	    @FXML
	    private ImageView imgABB;
	    
	    @FXML
	    private Label labTimeKeeper;

	    @FXML
	    private Label labTImeArrayList;

	    @FXML
	    private Label labTimeLinkedList;

	    @FXML
	    private Label labTimeABB;


	    @FXML
	    public void btRun(ActionEvent event) {
	    	if(radAdd.isSelected()) {
	    		if(radIterative.isSelected()) {
	    			race.addArrayList(Integer.parseInt(txtNumber.getText()));
	    			race.addABBIterative(Integer.parseInt(txtNumber.getText()));
	    			race.addValueLinkedListIterative(Integer.parseInt(txtNumber.getText()));
	    		}else {
	    			race.addArrayList(Integer.parseInt(txtNumber.getText()));
	    			race.addABBRecursive(Integer.parseInt(txtNumber.getText()));
	    			race.insertLinkedListRecursive(Integer.parseInt(txtNumber.getText()));
	    		}
	    	}else if(radSearch.isSelected()) {
	    		if(radIterative.isSelected()) {
	    			race.consultValueArrayListIterative(Integer.parseInt(txtNumber.getText()));
	    			race.consultValueABBIterative(Integer.parseInt(txtNumber.getText()));
	    			race.consultValueLinkedListIterative(Integer.parseInt(txtNumber.getText()));
	    		}else {
	    			race.consultValueLinkedListRecursive(Integer.parseInt(txtNumber.getText()));
	    			race.searchValueLinkedListRecursive(Integer.parseInt(txtNumber.getText()));
	    			race.consultValueABBRecursive(Integer.parseInt(txtNumber.getText()));
	    		}
	    	}
	    }
	    public void inicialize() {
	    	
	    }
	    
   }


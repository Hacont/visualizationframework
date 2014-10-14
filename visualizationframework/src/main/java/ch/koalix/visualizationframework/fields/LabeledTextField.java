package ch.koalix.visualizationframework.fields;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * Labeled TextField.
 * 
 * @author Simon Riedener
 *
 */
public class LabeledTextField extends VBox {
	
	private final TextField textField; 
	
	public LabeledTextField(String name) {
		textField = new TextField();
		this.getChildren().addAll(new Label(name), textField);
	}
	
	public void setText(String text) {
		this.textField.setText(text);
	}
	
	public String getText() {
		return this.textField.getText(); 
	}
	
	
}

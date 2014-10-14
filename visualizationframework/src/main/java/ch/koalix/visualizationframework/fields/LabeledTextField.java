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
	
	private final Label label; 
	private final TextField textField; 
	
	LabeledTextField(String name) {
		label = new Label(name);
		textField = new TextField();
		this.getChildren().addAll(label, textField);
	}
	
	public void setText(String text) {
		this.textField.setText(text);
	}
	
	public String getText() {
		return this.textField.getText(); 
	}
}
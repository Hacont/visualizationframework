package ch.koalix.visualizationframework.fields;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import javafx.scene.Parent;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.loadui.testfx.GuiTest;
import org.loadui.testfx.categories.TestFX;

public class LabeledTextFieldTest extends GuiTest {
	
	private final String SAMPEL_TEXT = "Some content in Textfield";
	
	@Override
	protected Parent getRootNode() {
		LabeledTextField textField = new LabeledTextField("");
		textField.setId("labeledTextField");
		return textField;
	}
	
	@Test
	public void newLabeledTextField() {
		final LabeledTextField textField = find("#labeledTextField");
	    textField.setText(SAMPEL_TEXT);
	    
	    assertThat(textField.getText(), is(SAMPEL_TEXT));
	}

	
}

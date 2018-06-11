package ch.makery.address.view;

import org.controlsfx.control.spreadsheet.SpreadsheetCellType.IntegerType;
import org.controlsfx.dialog.Dialogs;

import ch.makery.address.model.Person;
import ch.makery.address.util.DateUtil;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PersonEditDialogController {
	@FXML
	private TextField firstNameField;
	@FXML
	private TextField lastNameField;
	@FXML
	private TextField streetField;
	@FXML
	private TextField postalCodeField;
	@FXML
	private TextField cityField;
	@FXML
	private TextField birthdayField;
	
	private Stage dialogStage;
	private Person person;
	private boolean okClicked = false;
	
	@FXML
	private void initialize() {
	}
	
	public void setPerson(Person person) {
		this.person = person;
		
		firstNameField.setText(person.getFirstName());
		lastNameField.setText(person.getLastName());
		streetField.setText(person.getStreet());
		cityField.setText(person.getCity());
		postalCodeField.setText(Integer.toString(person.getPostalCode()));
		birthdayField.setText(DateUtil.format(person.getBirthday()));
	}
	
	public boolean isOkClicked() {
		return okClicked;
	}
	
	public void setDialogStage(Stage stage) {
		this.dialogStage = stage;
	}
	@FXML 
	private void handleOK() {
		if(isInputValid()) {
			person.setFirstName(firstNameField.getText());
			person.setLastName(lastNameField.getText());
			person.setPostalCode(Integer.parseInt(postalCodeField.getText()));
			person.setStreet(streetField.getText());
			person.setCity(cityField.getText());
			person.setBirthday(DateUtil.parse(birthdayField.getText()));
			
			okClicked = true;
			dialogStage.close();
		}
	}
	
	@FXML
	private void handleCancel() {
		dialogStage.close();
	}

	private boolean isInputValid() {
		String errorMessage = "";
		if(firstNameField.getText() == null || firstNameField.getText().length() == 0) {
			errorMessage += "Invalid FirstName!\n";
		}
		if(lastNameField.getText() == null || lastNameField.getText().length() == 0) {
			errorMessage += "Invalid LastName!\n";
		}
		if(postalCodeField.getText() == null || postalCodeField.getText().length() == 0) {
			errorMessage += "Invalid PostalCode!\n";
		}
		if(streetField.getText() == null || streetField.getText().length() == 0) {
			errorMessage += "Invalid Street!\n";
		}
		if(cityField.getText() == null || cityField.getText().length() == 0) {
			errorMessage += "Invalid City!\n";
		}
		if(!DateUtil.checkValid(birthdayField.getText())) {
			errorMessage += "Invalid Birthday!\n";
		}
		if(errorMessage.length() ==0) return true;
		
		Dialogs.create().title("Invalid Field").masthead("Please correct invalid fields").message(errorMessage).showError();
		return false;
	}
}

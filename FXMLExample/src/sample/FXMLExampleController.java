package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class FXMLExampleController {
    @FXML private TableView<Person> tableView;
    @FXML private TextField firstNameField;
    @FXML private TextField lastNameField;
    @FXML private TextField emailField;

    @FXML
    protected void addPerson(ActionEvent event) {
        ObservableList<Person> data = tableView.getItems();
        data.add(new Person(firstNameField.getText(),
                lastNameField.getText(),
                emailField.getText()
        ));

        firstNameField.setText("");
        lastNameField.setText("");
        emailField.setText("");
    }
    @FXML private Text actiontarget;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) throws IOException {
        Stage newStage = new Stage();

        Pane newPane = (Pane)FXMLLoader.load(getClass().getResource("fxml_tableview.fxml"));

        Scene secondScence = new Scene(newPane);
        newStage.setScene(secondScence);
        newStage.show();
    }

}

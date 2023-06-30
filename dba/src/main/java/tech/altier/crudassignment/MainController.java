package tech.altier.crudassignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import tech.altier.Main;
import tech.altier.dba.Connector;
import tech.altier.dba.Item;

public class MainController {
    @FXML
    private TableView tableView;

    @FXML
    public void initialize() {
        // need to populate the table view with the items from the database

        // query the database
        Item[] items = Connector.getAllItems();

        // populate the table view with the items
        for (Item item : items) {
            tableView.getItems().add(item);
        }
    }

    public void handleExit(ActionEvent actionEvent) {
    }

    public void handleAbout(ActionEvent actionEvent) {
    }

    public void handleCreate(ActionEvent actionEvent) {
    }

    public void handleRead(ActionEvent actionEvent) {
    }

    public void handleUpdate(ActionEvent actionEvent) {
    }

    public void handleDelete(ActionEvent actionEvent) {
    }
}
package BusinessGenie.app.Bossex.Views.Contacts;

import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class SuppliersPage implements Initializable {
    public BorderPane suppliersManagementBorderPane;
    public Button addButton;
    public ImageView addImageView;
    public ComboBox<String> entriesComboBox;
    public ImageView exportToCSVImageView1;
    public ImageView exportToExcelImageView1;
    public ImageView exportToPDFImageView1;
    public ImageView printImageView1;
    public TableView suppliersTableView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> entries = FXCollections.observableArrayList("25","50","100","200","500","1000","All");
        entriesComboBox .setItems(entries);
        entriesComboBox.setValue("25");
        suppliersTableView.setFixedCellSize(25);
        suppliersTableView.prefHeightProperty().bind(Bindings.size(suppliersTableView.getItems()).multiply(suppliersTableView.getFixedCellSize()).add(30));
    }
}

package BusinessGenie.app.Bossex.Services;

import BusinessGenie.app.Bossex.Bossex;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class UniversalUtility {
    public  void nextPage(ActionEvent event, String path, String title,boolean isDialog){
        Scene scene=getScene(path);
        if (isDialog)
        {
            //get the pre defines theme from database
            //scene.getStylesheets().add(getClass().getResource(Bossex.baseURL+"Css/"+ Bossex.userDetails.getTheme()+"Theme.css").toExternalForm());
            scene.getStylesheets().add(getClass().getResource(Bossex.baseURL+"Css/lightTheme.css").toExternalForm());
            Stage stage=new Stage();
            scene.setUserData(event);
            stage.setTitle(Bossex.appTitle+ title);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.initStyle(StageStyle.UTILITY);
            stage.show();
            stage.requestFocus();
        }
        else
        {
            scene.setUserData(event);
            if(path.equals("LoginPage.fxml"));
            //else scene.getStylesheets().add(getClass().getResource(Bossex.baseURL+"Css/"+ Bossex.userDetails.getTheme()+"Theme.css").toExternalForm());
            else scene.getStylesheets().add(getClass().getResource(Bossex.baseURL+"Css/lightTheme.css").toExternalForm());
            Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            primaryStage.setTitle(Bossex.appTitle + title);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.requestFocus();
        }
    }
    private Scene getScene(String path) {
        if(path.equals("LoginPage.fxml"))
            return Bossex.scene[0];
        else if(path.equals("MasterPage.fxml"))
            return Bossex.scene[1];
        else if(path.equals("SettingsPage.fxml"))
            return Bossex.scene[2];
        else if(path.equals("ReportManager/ReportManagementPage.fxml"))
            return Bossex.scene[4];
        else if(path.equals("InventoryManager/InventoryManagementPage.fxml"))
            return Bossex.scene[5];
        else if(path.equals("UserManager/UserManagementPage.fxml"))
            return Bossex.scene[6];
        else if(path.equals("UserManager/CreateUserPage.fxml"))
            return Bossex.scene[7];
        else if(path.equals("CustomerManager/CustomerManagementPage.fxml"))
            return Bossex.scene[8];
        else if(path.equals("SalesManager/ShowPreviousBills.fxml"))
            return Bossex.scene[9];
        else {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(Bossex.baseURL+"Views/" + path));
            Pane rootNode = null;
            try {
                rootNode = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            assert rootNode != null;
            return new Scene(rootNode);
        }
    }

    public void refresh(String theme)
    {
        for (Scene scene : Bossex.scene) {
            if (scene != null) {
                if(scene==Bossex.scene[0])continue;
                scene.getStylesheets().clear();
                scene.getStylesheets().add(getClass().getResource(Bossex.baseURL + "Css/" + theme).toExternalForm());
            }
        }
    }
}

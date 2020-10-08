package BusinessGenie.app.Bossex.Views.MasterPage;
/*
.root{
    -fx-font-family: "Courier New";
    -fx-base: #dbdbdb;
    -fx-background: #ffffff;
}
 */
import BusinessGenie.app.Bossex.Bossex;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.net.URL;
import java.util.ListIterator;
import java.util.ResourceBundle;

public class MasterPage implements Initializable {
    public TabPane MainAreaTabPane;
    public TabPane toolBarTabPane;
    public ImageView manageUsersImageView;
    public ImageView manageRolesImageView;
    public ImageView salesCommissionAgentsImageView;
    public ImageView manageSuppliersImageView;
    public ImageView manageCustomersImageView;
    public ImageView manageCustomersGroupsImageView;
    public ImageView manageProductsImageView;
    public ImageView addProductImageView;
    public ImageView printLabelImageView;
    public ImageView manageProductVariationsImageView;
    public ImageView importProductImageView;
    public ImageView importOpeningStockImageView;
    public ImageView sellingPriceGroupImageView;
    public ImageView manageUnitsImageView;
    public ImageView manageCategoriesImageView;
    public ImageView manageBrandsImageView;
    public ImageView warrantiesImageView;
    public ImageView helpImageView;
    public ImageView gettingStartedImageView;
    public ImageView contactSupportImageView;
    public ImageView demosAndScreenCastsImageView;
    public ImageView bugReportImageView;
    public ImageView submitFeedbackImageView;
    public ImageView downloadUpdateImageView;
    public ImageView aboutImageView;
    public ImageView manageTodoImageView;
    public ImageView openDashBoardImageView;
    public ImageView myProfileImageView;
    public ImageView businessSettingsImageView;
    public ImageView manageBusinessLocationImageView;
    public ImageView manageInvoiceSettingsImageView;
    public ImageView manageBarcodeSettingsImageView;
    public ImageView printerImageView;
    public ImageView manageTaxRatesImageView;
    public ImageView managePurchasesImageView;
    public ImageView addPurchaseImageView;
    public ImageView managePurchaseReturnImageView;
    public ImageView manageSalesImageView;
    public ImageView addSaleImageView;
    public ImageView managePOSImageView;
    public ImageView posImageView;
    public ImageView manageDraftsImageView;
    public ImageView manageQuotationsImageView;
    public ImageView manageSellReturnImageView;
    public ImageView manageShipmentsImageView;
    public ImageView manageDiscountsImageView;
    public ImageView importSalesImageView;
    public ImageView addStockTransfersImageView;
    public ImageView manageStockTransferImageView;
    public ImageView manageStockAdjustmentsImageView;
    public ImageView addStockAdjustmentsImageView;
    public ImageView manageExpensesImageView;
    public ImageView addExpenseImageView;
    public ImageView manageExpenseCategoriesImageView;
    public ImageView profitLossReportImageView;
    public ImageView purchaseSaleReportImageView;
    public ImageView taxReportImageView;
    public ImageView supplierCustomerReportImageView;
    public ImageView customerGroupsReportImageView;
    public ImageView stockReportImageView;
    public ImageView stockAdjustmentReportImageView;
    public ImageView trendingProductsReportImageView;
    public ImageView itemsReportImageView;
    public ImageView productPurchaseReportImageView;
    public ImageView productSellReportImageView;
    public ImageView purchasePaymentReportImageView;
    public ImageView sellPaymentReportImageView;
    public ImageView expenseReportImageView;
    public ImageView registerReportImageView;
    public ImageView salesRepresentativeReportImageView;
    public ImageView notificationTemplateImageView;
    public ImageView productTabImageView;
    public ImageView contactsTabImageView;
    public ImageView userManagementTabImageView;
    public ImageView purchasesTabImageView;
    public ImageView sellTabImageView;
    public ImageView stockTransferTabImageView;
    public ImageView stockAdjustmentsTabImageView;
    public ImageView expensesTabImageView;
    public ImageView reportsTabImageView;
    public ImageView settingsTabImageView;
    public ImageView helpTabImageView;
    public ImageView homeTabImageView;
    public ImageView applicationSettingsImageView;
    public ImageView logOutImageView;
    public ImageView importContactsImageView;
    public BorderPane MasterPageRootPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Bossex.masterTabPane=MainAreaTabPane;
        try {
            openDashBoardButtonAction();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void manageUsersButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Users");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/User/UserManagementPage.fxml"));
            Tab tab = new Tab("Users",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/user.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageRolesButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Role");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/User/RolesPage.fxml"));
            Tab tab = new Tab("Role",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageRoles.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void salesCommissionAgentsButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("SAC");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/User/SalesCommissionAgentPage.fxml"));
            Tab tab = new Tab("SAC",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/salesCommissionAgents.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }


    public void manageSuppliersButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Suppliers");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Contacts/SuppliersPage.fxml"));
            Tab tab = new Tab("Suppliers",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageSuppliers.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageCustomersButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Customers");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Contacts/CustomersPage.fxml"));
            Tab tab = new Tab("Customers",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/customers.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageCustomersGroupsButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Customer Groups");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Contacts/CustomerGroupsPage.fxml"));
            Tab tab = new Tab("Customer Groups",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/customerGroup.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }
    public void importContactsButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Import Contacts");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Contacts/ImportContacts.fxml"));
            Tab tab = new Tab("Import Contacts",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/importContacts.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }
    public void manageProductsButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Products Page");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Products/ProductsManagementPage.fxml"));
            Tab tab = new Tab("Products Page",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageProducts.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }
    public void addProductButtonAction(ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Products/AddProductPage.fxml"));
        Tab tab = new Tab("Add Product",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/addProduct.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }
    public void printLabelButtonAction(ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Products/PrintLabelPage.fxml"));
        Tab tab = new Tab("Print Label",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/printLabels.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }
    public void manageProductVariationsButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Variations");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Products/VariationsPage.fxml"));
            Tab tab = new Tab("Variations",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageProductVariations.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }
    public void importProductButtonAction(ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Products/ImportProductPage.fxml"));
        Tab tab = new Tab("Import Product",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/importProducts.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }
    public void importOpeningStockButtonAction(ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Products/ImportOpeningStocksPage.fxml"));
        Tab tab = new Tab("IOS",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/importOpeningStock.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }
    public void sellingPriceGroupButtonAction(ActionEvent event) throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Products/SellingPriceGroupPage.fxml"));
        Tab tab = new Tab("SPG",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/sellingPriceGroups.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }
    public void manageUnitsButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Units");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Products/UnitsManagementPage.fxml"));
            Tab tab = new Tab("Units",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageUnits.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }
    public void manageCategoriesButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Categories");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Products/CategoriesManagementPage.fxml"));
            Tab tab = new Tab("Categories",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageCategories.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }
    public void manageBrandsButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Brands");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Products/BrandsManagementPage.fxml"));
            Tab tab = new Tab("Brands",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageBrands.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }
    public void warrantiesButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Warranties");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Products/WarrantiesManagementPage.fxml"));
            Tab tab = new Tab("Warranties",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageWarranties.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }
    public void helpButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Help");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Help/HelpPage.fxml"));
            Tab tab = new Tab("Help",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/help.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void gettingStartedButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Getting Started");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Help/GettingStartedPage.fxml"));
            Tab tab = new Tab("Getting Started",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/gettingStarted.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void contactSupportButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Contact Support");
        if(index==-1)
        {

            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Help/ContactSupport.fxml"));
            Tab tab = new Tab("Contact Support",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/contactSupport.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void demosAndScreenButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Demonstration");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Help/DemosAndScreencastPage.fxml"));
            Tab tab = new Tab("Demonstration",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/demosAndScreenCasts.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void bugReportButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Report Bug");
        if(index==-1)
        {

            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Help/ReportBugPage.fxml"));
            Tab tab = new Tab("Report Bug",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/bugReport.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void submitFeedbackButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Submit Feedback");
        if(index==-1)
        {

            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Help/SubmitFeedbackPage.fxml"));
            Tab tab = new Tab("Submit Feedback",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/submitFeedback.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void downloadUpdateButtonAction(ActionEvent event) throws IOException {
        int index=getTabIndex("Updates");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Help/UpdatePage.fxml"));
            Tab tab = new Tab("Updates",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/update.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void aboutButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("About Us");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Help/AboutPage.fxml"));
            Tab tab = new Tab("About Us",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/aboutUs.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageTodoButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Todo");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Home/TodoPage.fxml"));
            Tab tab = new Tab("Todo",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageTodos.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void openDashBoardButtonAction()throws IOException {
        int index=getTabIndex("Dashboard");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Home/DashboardPage.fxml"));
            Tab tab = new Tab("Dashboard",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/openDashboard.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void myProfileButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Profile");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Home/ProfilePage.fxml"));
            Tab tab = new Tab("Profile",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/myProfile.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);}
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageBusinessLocationButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Business Loc.");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Settings/BusinessLocationPage.fxml"));
            Tab tab = new Tab("Business Loc.",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/businessLocation.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void businessSettingsButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Business Settings");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Settings/BusinessSettingsPage.fxml"));
            Tab tab = new Tab("Business Settings",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/businessSettings.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageInvoiceSettingsButtonAction(ActionEvent event) throws IOException{
        int index=getTabIndex("Invoice Settings");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Settings/InvoiceSettingsPage.fxml"));
            Tab tab = new Tab("Invoice Settings",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/invoiceSettings.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);}
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageBarcodeSettingsButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Barcode Settings");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Settings/BarcodeSettingsPage.fxml"));
            Tab tab = new Tab("Barcode Settings",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/barcodeSettings.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void printersButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Printers");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Settings/PrinterSettingsPage.fxml"));
            Tab tab = new Tab("Printers",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/printer.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageTaxRatesButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Tax Rates");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Settings/TaxRatesSettingsPage.fxml"));
            Tab tab = new Tab("Tax Rates",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/tax.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void managePurchasesButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("PO");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Purchases/PurchaseManagementPage.fxml"));
            Tab tab = new Tab("PO",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/managePurchases.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void addPurchaseButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Purchases/AddPurchasePage.fxml"));
        Tab tab = new Tab("add Po",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/addPurchase.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void managePurchaseReturnButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("PO Return");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Purchases/PurchaseReturnManagementPage.fxml"));
            Tab tab = new Tab("PO Return",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/managePurchaseReturn.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageSalesButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Sales Management");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Sell/SalesManagementPage.fxml"));
            Tab tab = new Tab("Sales Management",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageSales.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void addSaleButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Sell/AddSalePage.fxml"));
        Tab tab = new Tab("Add Sales",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/addSale.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void managePOSButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("List POS");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Sell/PosManagementPage.fxml"));
            Tab tab = new Tab("List POS",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/managePos.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void posButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Sell/PosPage.fxml"));
        Tab tab = new Tab("POS",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/pos.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void manageDraftsButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Drafts");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Sell/DraftManagementPage.fxml"));
            Tab tab = new Tab("Drafts",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageDrafts.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageQuotationsButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Quotations");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Sell/QuotationManagementPage.fxml"));
            Tab tab = new Tab("Quotations",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageQuotations.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);}
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageSellReturnButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Sell Return");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Sell/SellReturnManagementPage.fxml"));
            Tab tab = new Tab("Sell Return",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageSellReturn.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageShipmentsButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Shipments");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Sell/ShipmentManagementPage.fxml"));
            Tab tab = new Tab("Shipments",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageShipments.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);}
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageDiscountsButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Discounts");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Sell/DiscountManagementPage.fxml"));
            Tab tab = new Tab("Discounts",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageDiscounts.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);}
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void importSalesButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Import Sales");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Sell/ImportSalesPage.fxml"));
            Tab tab = new Tab("Import Sales",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/importSales.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void addStockTransfersButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/StockTransfers/AddStockTransferPage.fxml"));
        Tab tab = new Tab("Add ST",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/addStockTransfer.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void manageStockTransferButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Stock Transfer");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/StockTransfers/StockTransferManagementPage.fxml"));
            Tab tab = new Tab("Stock Transfer",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageStockTransfer.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void manageStockAdjustmentsButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Stock Adjustment");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/StockAdjustments/StockAdjustmentManagementPage.fxml"));
            Tab tab = new Tab("Stock Adjustment",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageStockAdjustments.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void addStockAdjustmentsButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/StockAdjustments/AddStockAdjustmentPage.fxml"));
        Tab tab = new Tab("Add SA",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/addStockAdjustment.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void manageExpensesButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Expenses");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Expenses/ExpensesManagementPage.fxml"));
            Tab tab = new Tab("Expenses",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/manageExpenses.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void addExpenseButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Expenses/AddExpensesPage.fxml"));
        Tab tab = new Tab("Add Expenses",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/addExpense.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void manageExpenseCategoriesButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Expense Categories");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Expenses/ExpenseCategoriesPage.fxml"));
            Tab tab = new Tab("Expense Categories",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/expensesGroups.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void profitLossReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/ProfitLossReportPage.fxml"));
        Tab tab = new Tab("Profit / Loss Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void purchaseSaleReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/PurchaseSaleReportPage.fxml"));
        Tab tab = new Tab("Purchase Sale Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void taxReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/TaxReportPage.fxml"));
        Tab tab = new Tab("Tax Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void supplierCustomerReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/SupplierCustomerReportPage.fxml"));
        Tab tab = new Tab("Supplier Customer Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void customerGroupsReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/CustomerGroupsReportPage.fxml"));
        Tab tab = new Tab("Customer Group Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void stockReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/StockReportPage.fxml"));
        Tab tab = new Tab("Stock Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void stockAdjustmentReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/StockAdjustmentReportPage.fxml"));
        Tab tab = new Tab("Stock Adjustment Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void trendingProductsReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/TrendingProductsReportPage.fxml"));
        Tab tab = new Tab("Trending Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void itemsReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/ItemsReportPage.fxml"));
        Tab tab = new Tab("Item Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void productPurchaseReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/ProductPurchaseReportPage.fxml"));
        Tab tab = new Tab("Product Purchase Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void productSellReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/ProductSellReportPage.fxml"));
        Tab tab = new Tab("Product Sale Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void purchasePaymentReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/PurchasePaymentReportPage.fxml"));
        Tab tab = new Tab("Purchase Payment Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void sellPaymentReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/SellPaymentReportPage.fxml"));
        Tab tab = new Tab("Sell Payment Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void expenseReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/ExpenseReportPage.fxml"));
        Tab tab = new Tab("Expense Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void registerReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/RegisterReportPage.fxml"));
        Tab tab = new Tab("Register Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void salesRepresentativeReportButtonAction(ActionEvent event)throws IOException {
        Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Reports/SalesRepresentativeReportPage.fxml"));
        Tab tab = new Tab("Sales Represent. Report",loader);
        ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/reports.png").toExternalForm()));
        imageView.setFitHeight(20);
        imageView.setFitWidth(20);
        tab.setGraphic(imageView);
        MainAreaTabPane.getTabs().add(tab);
        MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
    }

    public void notificationTemplateButtonAction(ActionEvent event)throws IOException {
        int index=getTabIndex("Notification Template");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Settings/NotificationTemplateSettingsPage.fxml"));
            Tab tab = new Tab("Notification Template",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/notificationTemplate.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void applicationSettingsButtonAction(ActionEvent event)throws IOException
    {
        int index=getTabIndex("Settings");
        if(index==-1)
        {
            Parent loader = FXMLLoader.load(getClass().getResource(Bossex.baseURL+"Views/Settings/BossexSettingsPage.fxml"));
            Tab tab = new Tab("Settings",loader);
            ImageView imageView=new ImageView(new Image(getClass().getResource(Bossex.baseURL+"Resources/settings.png").toExternalForm()));
            imageView.setFitHeight(20);
            imageView.setFitWidth(20);
            tab.setGraphic(imageView);
            MainAreaTabPane.getTabs().add(tab);
            MainAreaTabPane.getSelectionModel().select(MainAreaTabPane.getTabs().size()-1);
        }
        else {
            MainAreaTabPane.getSelectionModel().select(index);
        }
    }

    public void logOutButtonAction(ActionEvent event) throws IOException {
    }

    int getTabIndex(String tabName)
    {
        int index=-1;
        ListIterator<Tab> tabListIterator =MainAreaTabPane.getTabs().listIterator();
        for (ListIterator<Tab> it = tabListIterator; it.hasNext(); ) {
            Tab tab = it.next();
            if(tab.getText().equalsIgnoreCase(tabName))index=it.previousIndex();
        }
        return index;
    }

}
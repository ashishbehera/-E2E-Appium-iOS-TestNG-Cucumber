package stepDefinitions;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.Base;
import pageObjects.UIKitCatalogAlert;

import java.io.IOException;

public class UIKITCataloogAlert extends Base {

    IOSDriver<IOSElement> driver;
    UIKitCatalogAlert alert;

    @Given("Server is started and the UIKitCatalog Test APP is opened")
    public void server_is_started_and_the_ui_kit_catalog_test_app_is_opened() throws IOException, InterruptedException {
        startServer();
        driver = capabilities("UIKitCatalog");
    }
    @Given("Navigate to Alert Views Tab")
    public void navigate_to_alert_views_tab() {
        alert = new UIKitCatalogAlert(driver);
        alert.alertViews.click();
    }
    @Given("Click on Text Entry Sub-Tabs")
    public void click_on_text_entry_sub_tabs() {
        alert.txtEntryLink.click();
    }
    @Given("^Enter Text (.+)$")
    public void enter_text_hello(String txt) {
        alert.txtEntry.sendKeys(txt);
    }
    @When("Click on OK Button")
    public void click_on_ok_button() {
        alert.btnOK.click();
    }
    @Then("Click on Confirm or Cancel Sub-Tabs")
    public void click_on_confirm_cancel_sub_tabs() {
        alert.confirmOrCancelLink.click();
    }
    @Then("^Verify the message (.+) label$")
    public void verify_the_message_label(String message) {
        Assert.assertEquals(message, alert.getMessage.getText());
    }
    @Then("Click on Confirm Button")
    public void click_on_confirm_button() {
        alert.btnConfirm.click();
    }
    @Then("Stop the Server")
    public void stop_the_server() {
        stopServer();
    }
}

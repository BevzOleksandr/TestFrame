package pages.demoqa.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.base.BasePage;

public class DemoqaElementsPage extends BasePage {
    public DemoqaElementsPage(WebDriver driver) {
        super(driver);
    }

    private final By MAIN_HEADER_TEXT = By.xpath("//div[@class='main-header']");

    private final By TOP_LIST = By.xpath("//div[@class='element-group']");

    private final By ELEMENTS_BTN_IN_LIST = By.xpath("//div[contains(text(),'Elements')]");
    private final By FORMS_BTN_IN_LIST = By.xpath("//div[contains(text(),'Forms')]");
    private final By ALERTS_BTN_IN_LIST = By.xpath("//div[contains(text(),'Alerts')]");
    private final By WIDGETS_BTN_IN_LIST = By.xpath("//div[contains(text(),'Widgets')]");
    private final By INTERACTIONS_BTN_IN_LIST = By.xpath("//div[contains(text(),'Interactions')]");
    private final By BOOK_STORE_BTN_IN_LIST = By.xpath("//div[contains(text(),'Book')]");

    private final By TEXT_BOX_BTN = By.xpath("//span[contains(text(),'Text Box')]");
    private final By CHECK_BOX_BTN = By.xpath("//span[contains(text(),'Check Box')]");
    private final By RADIO_BTN = By.xpath("//span[contains(text(),'Radio button')]");
    private final By WEB_TABLES_BTN = By.xpath("//span[contains(text(),'Web Tables')]");
    private final By BUTTONS_BTN = By.xpath("//span[contains(text(),'Buttons')]");
    private final By LINKS_BTN = By.xpath("//span[contains(text(),'Links')]");
    private final By BROKEN_LINKS_BTN = By.xpath("//span[contains(text(),'Broken Links')]");
    private final By UPLOAD_DOWNLOAD_BTN = By.xpath("//span[contains(text(),'Upload and Download')]");
    private final By DYNAMIC_PROPERTIES_BTN = By.xpath("//span[contains(text(),'Dynamic Properties')]");


    public DemoqaElementsPage checkCountOfListBtns() {
        int countOfBtns = driver.findElements(TOP_LIST).size();
        Assert.assertEquals(countOfBtns, 6);
        return this;
    }

    public DemoqaElementsPage clickElementsBtn() {
        driver.findElement(ELEMENTS_TN_IN_LIST).click();
        return this;
    }

    public DemoqaElementsPage checkTextBoxBtnIsVisible() {
        boolean visibility = driver.findElement(TEXT_BOX_BTN).isDisplayed();
        return this;
    }
}

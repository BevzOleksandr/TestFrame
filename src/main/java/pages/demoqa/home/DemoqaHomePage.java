package pages.demoqa.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class DemoqaHomePage extends BasePage {

    public DemoqaHomePage(WebDriver driver) {
        super(driver);
    }
    private final By LOGO_IMG_BTN = By.xpath("//header/child::a");

    private final By SELENIUM_SERTIFICATION_PAGE_BTN = By.xpath("//div[@class='home-banner']");

    private final By ELEMENTS_PAGE_BTN = By.xpath("//div[@class='card mt-4 top-card']/descendant::h5[contains(text(),'Element')]");
    private final By FORMS_PAGE_BTN = By.xpath("//div[@class='card mt-4 top-card']/descendant::h5[contains(text(),'Forms')]");
    private final By ALERTS_PAGE_BTN = By.xpath("//div[@class='card mt-4 top-card']/descendant::h5[contains(text(),'Alerts')]");
    private final By WIDGETS_PAGE_BTN = By.xpath("//div[@class='card mt-4 top-card']/descendant::h5[contains(text(),'Interaction')]");
    private final By BOOK_STORE_PAGE_BTN = By.xpath("//div[@class='card mt-4 top-card']/descendant::h5[contains(text(),'Book')]");

    public DemoqaHomePage enterElementsPage(){
        driver.findElement(ELEMENTS_PAGE_BTN).click();
        return this;
    }

    public DemoqaHomePage enterFormsPage(){
        driver.findElement(FORMS_PAGE_BTN).click();
        return this;
    }
    public DemoqaHomePage enterAlertsPage(){
        driver.findElement(ALERTS_PAGE_BTN).click();
        return this;
    }
    public DemoqaHomePage enterWidgetsPage(){
        driver.findElement(WIDGETS_PAGE_BTN).click();
        return this;
    }
    public DemoqaHomePage enterBookStorePage(){
        driver.findElement(BOOK_STORE_PAGE_BTN).click();
        return this;
    }



}

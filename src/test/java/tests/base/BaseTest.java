package tests.base;

import common.CommonActions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.base.BasePage;
import pages.demoqa.elements.DemoqaElementsPage;
import pages.demoqa.home.DemoqaHomePage;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;
import static constants.Constant.Urls.DEMOQA_HOME_PAGE;

public class BaseTest {
    protected WebDriver driver = CommonActions.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected DemoqaHomePage demoqaHomePage = new DemoqaHomePage(driver);
    protected DemoqaElementsPage demoqaElementsPage = new DemoqaElementsPage(driver);

    @BeforeTest
    public void runDemoqaHomePage() {
        basePage.open(DEMOQA_HOME_PAGE);
    }

    @AfterTest
    public void clearCookiesAndLocalStorage() {
        if(CLEAR_COOKIES){
            driver.manage().deleteAllCookies();
        }
    }

    @AfterSuite (alwaysRun = true)
    public void close() {
        if(HOLD_BROWSER_OPEN){
            driver.quit();
        }
    }
}

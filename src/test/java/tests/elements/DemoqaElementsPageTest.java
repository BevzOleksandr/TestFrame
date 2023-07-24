package tests.elements;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class DemoqaElementsPageTest extends BaseTest {
    @Test(suiteName = "ElementsPage")
    public void checkCountOfListBtns() {
        demoqaHomePage.enterElementsPage();
        demoqaElementsPage.checkCountOfListBtns();
    }

    @Test (suiteName = "ElementsPage")
    public void checkVisibilityOfTextBoxBtn() {
        demoqaHomePage.enterElementsPage();
        demoqaElementsPage
                .clickElementsBtn()
                .checkTextBoxBtnIsVisible();
    }
}

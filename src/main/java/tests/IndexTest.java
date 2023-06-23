package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexTest extends BaseTest {

    @Test
    public void verifyPathToElementsPage() {
        getIndexPage().open();
        scrollDown(200);
        getIndexPage().getCategoryCard(0).click();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/elements"));
    }
    @Test
    public void verifyPathToBookStoreApplicationPage(){
        getIndexPage().open();
        scrollDown(800);
        getIndexPage().getCategoryCard(5).click();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/books"));
    }
}

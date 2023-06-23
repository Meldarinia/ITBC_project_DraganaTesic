package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginBookStoreTest extends BaseTest {

    @Test
    public void verifyLoginAsRegisteredUser() {
        getLoginBookStorePage().open()
                .logInWithData("janedo", "Password_%123");
        scrollDown(200);
        getLoginBookStorePage().clickLoginButton();
        waitPageLoads("/profile");

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/profile");
    }

    @Test
    public void verifyLogInIsNotPossibleWithoutCredentials() {
        getLoginBookStorePage().open();
        scrollDown(200);
        getLoginBookStorePage().clickLoginButton();

        assertVisibilityOfElement(getLoginBookStorePage().getRequiredUserNameMessage());
        assertVisibilityOfElement(getLoginBookStorePage().getGetRequiredPasswordMessage());
    }
}

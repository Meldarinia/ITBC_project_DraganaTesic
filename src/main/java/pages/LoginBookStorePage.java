package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginBookStorePage extends BasePage {

    private WebElement userNameField;
    private WebElement passwordField;
    private WebElement loginButton;
    private WebElement requiredUserNameMessage;
    private WebElement requiredPasswordMessage;

    public LoginBookStorePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getUserNameField() {
        userNameField = getDriver().findElement(By.id("userName"));
        return userNameField;
    }

    public WebElement getPasswordField() {
        passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }

    public WebElement getLoginButton() {
        loginButton = getDriver().findElement(By.id("login"));
        return loginButton;
    }

    public WebElement getRequiredUserNameMessage() {
        requiredUserNameMessage = getDriver().findElement(By.xpath("//input[@id='userName'][@class='mr-sm-2 is-invalid form-control']"));
        return requiredUserNameMessage;
    }

    public WebElement getGetRequiredPasswordMessage() {
        requiredPasswordMessage = getDriver().findElement(By.xpath("//input[@id='password'][@class='mr-sm-2 is-invalid form-control']"));
        return requiredPasswordMessage;
    }

    public void logInWithData(String username, String password) {
        getUserNameField().sendKeys(username);
        getPasswordField().sendKeys(password);
    }

    public LoginBookStorePage clickLoginButton() {
        getLoginButton().click();
        return this;
    }

    public LoginBookStorePage open() {
        getDriver().get("https://demoqa.com/login");
        return this;
    }
}

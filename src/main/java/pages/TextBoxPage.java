package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage {

    private WebElement fullNameField;
    private WebElement emailField;
    private WebElement currentAddressField;
    private WebElement permanentAddressField;
    private WebElement submitButton;
    private WebElement checkBox;
    private WebElement invalidEmailForm;

    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFullNameField() {
        fullNameField = getDriver().findElement(By.id("userName"));
        return fullNameField;
    }

    public WebElement getEmailField() {
        emailField = getDriver().findElement(By.id("userEmail"));
        return emailField;
    }

    public WebElement getCurrentAddressField() {
        currentAddressField = getDriver().findElement(By.id("currentAddress"));
        return currentAddressField;
    }

    public WebElement getPermanentAddressField() {
        permanentAddressField = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddressField;
    }

    public WebElement getSubmitButton() {
        submitButton = getDriver().findElement(By.id("submit"));
        return submitButton;
    }

    public WebElement getCheckBox() {
        checkBox = getDriver().findElement(By.id("output"));
        return checkBox;
    }

    public WebElement getInvalidEmailForm() {
        invalidEmailForm = getDriver().findElement(By.xpath("//input[@class='mr-sm-2 field-error form-control']"));
        return invalidEmailForm;
    }

    public TextBoxPage open() {
        getDriver().get("https://demoqa.com/text-box");
        return this;
    }

    public TextBoxPage enterFullName(String name) {
        getFullNameField().sendKeys(name);
        return this;
    }

    public TextBoxPage enterEmail(String email) {
        getEmailField().sendKeys(email);
        return this;
    }

    public TextBoxPage enterCurrentAddress(String address) {
        getCurrentAddressField().sendKeys(address);
        return this;
    }

    public TextBoxPage enterPermanentAddress(String address) {
        getPermanentAddressField().sendKeys(address);
        return this;
    }

    public TextBoxPage clickSubmit() {
        getSubmitButton().click();
        return this;
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage {
    private WebElement yesButton;
    private WebElement impressiveButton;
    private WebElement noButton;
    private WebElement yesMessage;
    private WebElement impressiveMessage;

    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getYesButton() {
        yesButton = getDriver().findElement(By.cssSelector("#app > div > div > div > div.col-12.mt-4.col-md-6 > div:nth-child(3) > div:nth-child(2) > label"));
        return yesButton;
    }

    public WebElement getImpressiveButton() {
        impressiveButton = getDriver().findElement(By.cssSelector("#app > div > div > div > div.col-12.mt-4.col-md-6 > div:nth-child(3) > div:nth-child(3) > label"));
        return impressiveButton;
    }

    public WebElement getYesMessage() {
        yesMessage = getDriver().findElement(By.xpath("//span[contains(text(), 'Yes')]"));
        return yesMessage;
    }

    public WebElement getImpressiveMessage() {
        impressiveMessage = getDriver().findElement(By.xpath("//span[contains(text(), 'Impressive')]"));
        return impressiveMessage;
    }

    public RadioButtonPage clickRadioButton(WebElement element) {
        element.click();
        return this;
    }

    public RadioButtonPage open() {
        getDriver().get("https://demoqa.com/radio-button");
        return this;
    }
}

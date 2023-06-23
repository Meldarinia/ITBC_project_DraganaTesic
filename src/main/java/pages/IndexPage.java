package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class IndexPage extends BasePage {
    private WebElement categoryCard;

    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getCategoryCard(int index) {
        List<WebElement> cards = getDriver().findElements(By.xpath("//div[@class='card mt-4 top-card']"));
        categoryCard = cards.get(index);
        return categoryCard;
    }

    public IndexPage open() {
        getDriver().get("https://demoqa.com/");
        return this;
    }
}

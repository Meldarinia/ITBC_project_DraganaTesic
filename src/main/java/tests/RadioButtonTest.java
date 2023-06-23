package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void checkYesRadioButton() {
        getRadioButtonPage().open()
                .clickRadioButton(getRadioButtonPage().getYesButton());
        Assert.assertTrue(getRadioButtonPage().getYesMessage().isDisplayed());
    }

    @Test
    public void checkImpressiveRadioButton() {
        getRadioButtonPage().open()
                .clickRadioButton(getRadioButtonPage().getImpressiveButton());
        Assert.assertTrue(getRadioButtonPage().getImpressiveMessage().getText().contains("Impressive"));
    }
}

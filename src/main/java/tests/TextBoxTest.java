package tests;

import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @Test
    public void verifyRegistrationWithAllValidData() {
        getTextBoxPage().open()
                .enterFullName("Jane Do")
                .enterEmail("jane@gmail.com")
                .enterCurrentAddress("1st street 1")
                .enterPermanentAddress("2nd street 1");
        scrollDown(300);
        getTextBoxPage().clickSubmit();

        assertVisibilityOfElement(getTextBoxPage().getCheckBox());
    }

    @Test
    public void verifyRegistrationIsNotPossibleWithInvalidEmailData() {
        getTextBoxPage().open()
                .enterFullName("Jane Do")
                .enterEmail("jane @gmail.com")
                .enterCurrentAddress("1st street 1")
                .enterPermanentAddress("2nd street 1");
        scrollDown(300);
        getTextBoxPage().clickSubmit();

        assertVisibilityOfElement(getTextBoxPage().getInvalidEmailForm());
    }
}

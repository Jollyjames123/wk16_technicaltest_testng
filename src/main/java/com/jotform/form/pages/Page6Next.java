package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Page6Next extends Utility {
    public Page6Next() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#form-pagebreak-next_14")
    WebElement nextButton;

    public void clickOnNextButton() {
        Reporter.log("clicking on next button: " + nextButton.toString());
        pmClickOnElement(nextButton);
    }
}

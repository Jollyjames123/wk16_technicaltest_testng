package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Page8Verify extends Utility {
    public Page8Verify() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank You!')]")
    WebElement thankYouMessage;

    public void verifyTheMessage(String message) {
        Reporter.log("verifying the message: " + message);
        pmVerifyElements(thankYouMessage, message, "message is not displayed correctly");

    }

}

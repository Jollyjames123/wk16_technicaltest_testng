package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Page5SecurityQuestion extends Utility {
    public Page5SecurityQuestion() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"input_11\"]")
    WebElement questionDropdown;
    @FindBy(xpath = "//input[@id='input_12']")
    WebElement answerField;
    @FindBy(id = "form-pagebreak-next_13")
    WebElement nextButton;

    public void enterQuestion(String question) {
        Reporter.log("selecting the question: " + question);
        pmSelectByVisibleTextFromDropDown(questionDropdown, question);
    }

    public void enterAnwser(String answer) {
        Reporter.log("entering the answer: " + answer);
        pmSendTextToElement(answerField, answer);
    }

    public void clickOnNextButton() {
        Reporter.log("clicking on next button: " + nextButton.toString());
        pmClickOnElement(nextButton);
    }
}
package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Page2DropFile extends Utility {
    public Page2DropFile() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#form-pagebreak-next_4")
    WebElement nextButton;

    @FindBy(xpath = "//*[@id=\"input_6\"]")
    WebElement fileUpload;

    public void clickOnNextButton() {
        pmClickOnElement(nextButton);
        Reporter.log("clicking on next button: " + nextButton.toString());
    }

    public void fileUploadMethod(String filePath) {
        Reporter.log("uploading the file: " + filePath);
        //click on the box to browse and upload file using sendkeys
        fileUpload.sendKeys(filePath); //Uploading the file using sendKeys
        System.out.println("File is Uploaded Successfully");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}


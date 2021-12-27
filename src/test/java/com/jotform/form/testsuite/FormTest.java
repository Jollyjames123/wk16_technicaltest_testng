package com.jotform.form.testsuite;

import com.jotform.form.customlisteners.CustomListeners;
import com.jotform.form.pages.*;
import com.jotform.form.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class FormTest extends TestBase {

    Page1HomePage page1HomePage;
    Page2DropFile page2DropFile;
    Page3Signature page3Signature;
    Page4Date page4Date;
    Page5SecurityQuestion page5SecurityQuestion;
    Page6Next page6Next;
    Page7Submit page7Submit;
    Page8Verify page8Verify;

    @BeforeMethod
    public void init() {
        page1HomePage = new Page1HomePage();
        page2DropFile = new Page2DropFile();
        page3Signature = new Page3Signature();
        page4Date = new Page4Date();
        page5SecurityQuestion = new Page5SecurityQuestion();
        page6Next = new Page6Next();
        page7Submit = new Page7Submit();
        page8Verify = new Page8Verify();
    }

    @Test
    @Parameters({"fname1", "lname1", "filepath1", "date1", "question1", "answer1", "message1"})
    public void technicalTest(String fName, String lName, String filePath, String date, String question, String answer, String message) throws InterruptedException {
        page1HomePage.enterFirstName(fName);
        page1HomePage.enterLastName(lName);
        page1HomePage.clickOnNextButton();
        page2DropFile.fileUploadMethod(filePath);
        page2DropFile.clickOnNextButton();
        page3Signature.doingTheSignature();
        page3Signature.clickOnNextButton();
        page4Date.enteringTheDate(date);
        page4Date.clickOnNextButton();
        page5SecurityQuestion.enterQuestion(question);
        page5SecurityQuestion.enterAnwser(answer);
        page5SecurityQuestion.clickOnNextButton();
        page6Next.clickOnNextButton();
        page7Submit.clickOnSubmit();
        page8Verify.verifyTheMessage(message);


    }
}

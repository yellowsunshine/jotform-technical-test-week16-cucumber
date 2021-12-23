package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page7FinalPage extends Utility {

    private static final Logger log = LogManager.getLogger(Page7FinalPage.class.getName());

    public Page7FinalPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='jfThankYou-description form-subHeader']")
    WebElement verificationText;

    public void verifyThatSubmissionHasBeenReceived(String expectedMessage){
       log.info("Verifying the submission message: " + verificationText.toString() + "<br>");
        String actualMessage = pmGetTextFromElement(verificationText);
        doVerifyElementsJU("Incorrect submission",expectedMessage,actualMessage );
    }


}

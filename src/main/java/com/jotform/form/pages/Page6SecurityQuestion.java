package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page6SecurityQuestion extends Utility {

    private static final Logger log = LogManager.getLogger(Page6SecurityQuestion.class.getName());

    public Page6SecurityQuestion() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='input_11_field_1']")
    WebElement questionDropDown;

    @FindBy (id = "input_11_field_2")
    WebElement answerField;

    @FindBy (xpath = "//button[@class='jfInput-button forSubmit form-submit-button u-right']")
    WebElement submitButton;

    public void selectFromDropDown(String question){
       log.info("Selecting from question dropdown : " + question);
        pmSelectByVisibleTextFromDropDown(questionDropDown, question );
    }

    public void enterSecurityAnswer(String answer){
        log.info("Entering the security answer : " + answer);
        pmSendTextToElement(answerField, answer);
    }

    public void clickOnSubmitButton(){
        log.info("Click on the Submit button : " + submitButton.toString());
        pmClickOnElement(submitButton);
    }

}

package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2TestForm extends Utility {

    private static final Logger log = LogManager.getLogger(Page2TestForm.class.getName());

    public Page2TestForm() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "first_3")
    WebElement firstName;

    @FindBy (id = "last_3")
    WebElement lastName;

    @FindBy (xpath = "//div[@data-type='control_fullname']"  +
            "//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement testFormNextButton;

    public void enterFirstNameInTheFirstNameField(String name){
        log.info("Enter the first name : " + name);
        pmSendTextToElement(firstName, name);
    }

    public void enterLastNameInTheLastNameField(String lname) {
        log.info("Enter the last name : " + lname);
        pmSendTextToElement(lastName, lname);
    }

    public void clickOnNextButtonOnTestFormPage(){
        log.info("Click on the next button on test form page : " + testFormNextButton.toString());
        pmClickOnElement(testFormNextButton);
    }


}

package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(Page1HomePage.class.getName());

    public Page1HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#jfCard-welcome-start")
    WebElement nextButton;


    public void clickOnNextButton(){
        pmClickOnElement(nextButton);
        log.info("click on next button : " + nextButton.toString());

    }
}

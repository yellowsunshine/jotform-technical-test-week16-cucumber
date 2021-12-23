package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page5DatePage extends Utility {

    private static final Logger log = LogManager.getLogger(Page5DatePage.class.getName());

    public Page5DatePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@aria-label='Calendar icon']")
    WebElement dateIcon;

    @FindBy(xpath = "//td[normalize-space()='24']")
    WebElement date;

    @FindBy(xpath = "//div[@data-type='control_datetime']" +
            "//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement datePageNextButton;

    public void selectDate(){
        pmWaitUntilVisibilityOfElementLocated(By.xpath("//span[@aria-label='Calendar icon']"), 100).click();
        pmWaitUntilVisibilityOfElementLocated(By.xpath("//td[normalize-space()='24']"), 100).click();
        log.info("Selecting the date : " + dateIcon.toString());
    }

    public void clickOnNext(){
        log.info("Click on the next button on date page : " + datePageNextButton.toString());
        pmClickOnElement(datePageNextButton);
    }

}

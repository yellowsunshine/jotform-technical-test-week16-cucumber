package com.jotform.form.pages;

import com.jotform.form.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4SignaturePage extends Utility {

    private static final Logger log = LogManager.getLogger(Page4SignaturePage.class.getName());

    public Page4SignaturePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#signature_pad_7")
    WebElement canvasElement;

    @FindBy(xpath = "//div[@data-type='control_signature']" +
            "//button[@aria-label='Next'][normalize-space()='Next']")
    WebElement signaturePageNextButton;

    @FindBy (xpath = "//span[normalize-space()='Signature']")
    WebElement signatureLabel;


    public void createSignature() throws InterruptedException {

        Actions builder = new Actions(driver);

        Thread.sleep(2000);

        Action signature = builder.moveToElement(canvasElement)
                .clickAndHold()
                .moveToElement(canvasElement, 20, -50)
                .moveByOffset(50, 50)
                .moveByOffset(80, -50)
                .moveByOffset(100, 50)
                .release(canvasElement)
                .build();
        signature.perform();

        Thread.sleep(10000);

        pmClickOnElement(signatureLabel);
    }

    public void clickOnNextButton() {
        log.info("Click on the Next Button on signature page : " + signaturePageNextButton.toString());
        pmClickOnElement(signaturePageNextButton);
    }
}

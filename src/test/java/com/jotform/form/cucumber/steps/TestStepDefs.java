package com.jotform.form.cucumber.steps;

import com.jotform.form.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.awt.*;

public class TestStepDefs {
    @Given("^User is on the jotform webpage$")
    public void userIsOnTheJotformWebpage() {
    }

    @When("^User clicks on the next button from the home page$")
    public void userClicksOnTheNextButtonFromTheHomePage() {
        new Page1HomePage().clickOnNextButton();
    }

    @And("^enters first name \"([^\"]*)\" in the first name field$")
    public void entersFirstNameInTheFirstNameField(String name)  {
        new Page2TestForm().enterFirstNameInTheFirstNameField(name);

    }

    @And("^enters last name \"([^\"]*)\" in the last name field$")
    public void entersLastNameInTheLastNameField(String lname)  {
        new Page2TestForm().enterLastNameInTheLastNameField(lname);

    }

    @And("^clicks on the next button on the Test Form Page$")
    public void clicksOnTheNextButtonOnTheTestFormPage() {
        new Page2TestForm().clickOnNextButtonOnTestFormPage();
    }

    @And("^attaches a file$")
    public void attachesAFile() throws AWTException {
        new Page3BrowseAndDropFiles().uploadFile("C:\\Users\\Kinjal\\Desktop\\TestDoc.docx");
    }

    @And("^creates a signature$")
    public void createsASignature() throws InterruptedException {
        new Page4SignaturePage().createSignature();
    }

    @And("^clicks on the next button on the signature page$")
    public void clicksOnTheNextButtonOnTheSignaturePage() {
        new Page4SignaturePage().clickOnNextButton();
    }

    @And("^selects the date$")
    public void selectsTheDate() {
        new Page5DatePage().selectDate();
    }

    @And("^clicks on the next button on the date page$")
    public void clicksOnTheNextButtonOnTheDatePage() {
        new Page5DatePage().clickOnNext();
    }

    @And("^selects the security question \"([^\"]*)\" from the dropdown$")
    public void selectsTheSecurityQuestionFromTheDropdown(String question)  {
        new Page6SecurityQuestion().selectFromDropDown(question);

    }

    @And("^answers the security question \"([^\"]*)\"$")
    public void answersTheSecurityQuestion(String answer)  {
        new Page6SecurityQuestion().enterSecurityAnswer(answer);

    }

    @And("^clicks on the submit button$")
    public void clicksOnTheSubmitButton() {
        new Page6SecurityQuestion().clickOnSubmitButton();
    }

    @Then("^verifies that the submission has been received \"([^\"]*)\"$")
    public void verifiesThatTheSubmissionHasBeenReceived(String message)  {
        new Page7FinalPage().verifyThatSubmissionHasBeenReceived(message);

    }
}

package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.apache.commons.math3.analysis.function.Add;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {


    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "middleName")
    public WebElement middleName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "employeeId")
    public WebElement employeeID;

    @FindBy(id = "chkLogin")
    public WebElement loginCheckBox;

    @FindBy(id = "btnSave")
    public WebElement saveBtn;

   public AddEmployeePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
